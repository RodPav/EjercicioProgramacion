package com.people.EjercicioProgramacion.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.people.EjercicioProgramacion.domain.Course;
import com.people.EjercicioProgramacion.repositories.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepo;

	@Override
	public Course findCourseById(Integer id) {
		return courseRepo.findById(id).get();
	}

	@Override
	public List<Course> findAllCourses() {
		return (List<Course>) courseRepo.findAll();
	}

	@Override
	public Course saveCourse(Course course) {
		return courseRepo.save(course);
	}

	@Override
	public void deleteCourse(Integer id) {

		courseRepo.deleteById(id);
	}

	@Override
	public Course updateCourse(Course newCourse, Integer id) {

		return courseRepo.findById(id).map(course -> {
			course.setName(newCourse.getName());
			course.setCode(newCourse.getCode());
			return courseRepo.save(course);
		}).orElseGet(() -> {
			newCourse.setId(id);
			return courseRepo.save(newCourse);
		});
	}
}
