package com.people.EjercicioProgramacion.services;

import java.util.List;

import com.people.EjercicioProgramacion.domain.Student;

public interface StudentService {
	
	Student findStudentById(Integer id);
	
	List<Student> findAllStudents();
	
	Student saveStudent(Student student);


}
