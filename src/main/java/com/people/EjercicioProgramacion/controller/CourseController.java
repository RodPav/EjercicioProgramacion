package com.people.EjercicioProgramacion.controller;

import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;

import com.people.EjercicioProgramacion.domain.Course;
import com.people.EjercicioProgramacion.services.CourseService;

@RestController
@RequestMapping("/courses")
public class CourseController {

	@Autowired
	private CourseService courseService;

	@GetMapping
	public List<Course> getCourses() {
	
		return courseService.findAllCourses();

	}

	@GetMapping("/{id}")
	public Course getCourseById(@PathVariable Integer id) {
		
		return courseService.findCourseById(id);
	}

	@PostMapping
	public Course setCourse(@RequestBody Course course) {
		
		return courseService.saveCourse(course);
	}
}
