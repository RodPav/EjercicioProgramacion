package com.people.EjercicioProgramacion.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

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
	@ResponseStatus(HttpStatus.CREATED)
	public Course addCourse(@RequestBody Course course) {

		return courseService.saveCourse(course);
	}

	@DeleteMapping("/{id}")
	public String deleteCourse(@PathVariable Integer id) {

		courseService.deleteCourse(id);
		return "Course Deleted";

	}
	
	@PutMapping("/{id}")
	public Course updateCourse(@RequestBody Course course, @PathVariable Integer id) {
		return courseService.updateCourse(course, id);
	}

}
