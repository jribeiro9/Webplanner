package com.webplanner.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webplanner.model.Mes;
import com.webplanner.repository.MesRepository;


@Service
@Transactional(readOnly = true)
public class MesService {

	@Autowired
	private MesRepository mesRepository;

	public List<Mes> findAll() {
		return mesRepository.findAll();
	}
	
	public Optional<Mes> findOne(Integer id) {
		return mesRepository.findById(id);
	}
	
	@Transactional(readOnly = false)
	public Mes save(Mes entity) {
		return mesRepository.save(entity);
	}

	@Transactional(readOnly = false)
	public void delete(Mes entity) {
		mesRepository.delete(entity);
	}
}
