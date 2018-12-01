package com.webplanner.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webplanner.model.Planner;
import com.webplanner.repository.PlannerRepository;

@Service
@Transactional(readOnly = true)
public class PlannerService {

	@Autowired
	private PlannerRepository plannerRepository;

	public List<Planner> findAll() {
		return plannerRepository.findAll();
	}
	
	public Optional<Planner> findOne(Integer id) {
		return plannerRepository.findById(id);
	}
	
	@Transactional(readOnly = false)
	public Planner save(Planner entity) {
		return plannerRepository.save(entity);
	}

	@Transactional(readOnly = false)
	public void delete(Planner entity) {
		plannerRepository.delete(entity);
	}

}