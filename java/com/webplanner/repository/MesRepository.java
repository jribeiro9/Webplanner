package com.webplanner.repository;

import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webplanner.model.Mes;

@Repository
public interface MesRepository extends JpaRepository<Mes, Integer> {
	
}