package com.people.EjercicioProgramacion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.people.EjercicioProgramacion.domain.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
