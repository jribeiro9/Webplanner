package com.webplanner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webplanner.model.Mes;
import com.webplanner.model.Planner;
import com.webplanner.service.MesService;

@Controller
@RequestMapping("/mes")
public class MesController {
	@Autowired
	private MesService mesService;
	
	@GetMapping
	public String index(Model model) {
		
		return "mes/index";
	}
}
