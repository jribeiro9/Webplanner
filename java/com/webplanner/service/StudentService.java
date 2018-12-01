package com.webplanner.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webplanner.model.Student;
import com.webplanner.repository.StudentRepository;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public List<Student> findAll() {
		return studentRepository.findAll();
	}
	
	public Optional<Student> findOne(Integer id) {
		return studentRepository.findById(id);
	}
	
	@Transactional(readOnly = false)
	public Student save(Student entity) {
		return studentRepository.save(entity);
	}

	@Transactional(readOnly = false)
	public void delete(Student entity) {
		studentRepository.delete(entity);
	}

}
	
