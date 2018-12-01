package com.webplanner.repository;
import org.springframework.stereotype.Repository;

import com.webplanner.model.Module;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ModuleRepository extends JpaRepository<Module, Integer> {
	
}