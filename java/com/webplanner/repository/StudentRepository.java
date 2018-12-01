package com.webplanner.repository;


import org.springframework.stereotype.Repository;

import com.webplanner.model.Student;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
}