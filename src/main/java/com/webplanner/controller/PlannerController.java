package com.webplanner.controller;
import java.util.List;

import javax.validation.Valid;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.webplanner.model.Ano;
import com.webplanner.model.Mes;
import com.webplanner.model.Planner;
import com.webplanner.service.PlannerService;

@Controller
@RequestMapping("/planner")
public class PlannerController {
	
	@Autowired
	private PlannerService plannerService;
	
	@GetMapping
	public String index(Model model) {
		List<Planner> all = plannerService.findAll();
		model.addAttribute("listPlanner", all);
		model.addAttribute("");
		return "planner/index";
	}
	
	@GetMapping("/{id}")
	public String show(Model model, @PathVariable("id") Integer id) {
		if (id != null) {
			Planner planner = plannerService.findOne(id).get();
			model.addAttribute("planners", planner);
		}
		return "planner/show";
	}
	
	@GetMapping(value = "/new")
	public String create(Model model, @ModelAttribute Planner entityPlanner) {
		entityPlanner.setAno(new Ano());
		
		for(int i=0;i<12;i++) {
			entityPlanner.getAno().getMeses().add(new Mes());
		}
		return "planner/form";
	}
	
	@PostMapping
	public String create(@Valid @ModelAttribute Planner entityPlanner, 
			             BindingResult result, RedirectAttributes redirectAttributes) {
		Planner planner = null;
		String pagina_retorno = "redirect:/planner/" ;
	
		try {
			planner = plannerService.save(entityPlanner);
			redirectAttributes.addFlashAttribute("success", MSG_SUCESS_INSERT);
			pagina_retorno = pagina_retorno + planner.getId();
		} catch (Exception e) {
			e.printStackTrace();
			redirectAttributes.addFlashAttribute("error", MSG_ERROR);
		}catch (Throwable e) {
			e.printStackTrace();
			redirectAttributes.addFlashAttribute("error", MSG_ERROR);
		}	
		return pagina_retorno;
	}
	
	@RequestMapping("/{id}/delete")
	public String delete(@PathVariable("id") Integer id, RedirectAttributes redirectAttributes) {
		try {
			if (id != null) {
				Planner entity = plannerService.findOne(id).get();
				plannerService.delete(entity);
				redirectAttributes.addFlashAttribute("success", MSG_SUCESS_DELETE);
			}
		} catch (Exception e) {
			redirectAttributes.addFlashAttribute("error", MSG_ERROR);
			throw new ServiceException(e.getMessage());
		}
		return "redirect:/planner/";
	}
	
	private static final String MSG_SUCESS_INSERT = "SUCCESS";
	private static final String MSG_SUCESS_DELETE = "SUCCESS";
	private static final String MSG_ERROR = "ERROR";
}
