package com.people.EjercicioProgramacion.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.people.EjercicioProgramacion.domain.Student;
import com.people.EjercicioProgramacion.repositories.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepo;
	
	@Override
	public Student findStudentById(Integer id) {
		return studentRepo.findById(id).get();
	}

	@Override
	public List<Student> findAllStudents() {
		return studentRepo.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}

}
