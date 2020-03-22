package com.people.EjercicioProgramacion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.people.EjercicioProgramacion.domain.Student;
import com.people.EjercicioProgramacion.services.StudentService;

@RestController
@RequestMapping("/app/v1")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		return studentService.findAllStudents();
	}
	
	@GetMapping("students/{id}")
	public Student getStudentById(@PathVariable Integer id) {
		return studentService.findStudentById(id);
	}
	
	@PostMapping("/students")
	public Student setStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}
}