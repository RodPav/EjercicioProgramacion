package com.people.EjercicioProgramacion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.people.EjercicioProgramacion.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
