package com.webplanner.repository;

import org.springframework.stereotype.Repository;

import com.webplanner.model.Planner;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PlannerRepository extends JpaRepository<Planner, Integer> {
	
}