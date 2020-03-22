package com.people.EjercicioProgramacion.services;

import java.util.List;

import com.people.EjercicioProgramacion.domain.Course;

public interface CourseService {
	
	Course findCourseById(Integer id);
	
	List<Course> findAllCourses();
	
	Course saveCourse(Course course);

}
