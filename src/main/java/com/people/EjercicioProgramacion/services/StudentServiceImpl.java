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

	@Override
	public Student updateStudent(Student newStudent, Integer id) {
		
		return studentRepo.findById(id)
				.map(student -> {
			student.setRut(newStudent.getRut());
			student.setName(newStudent.getName());
			student.setLastName(newStudent.getLastName());
			student.setAge(newStudent.getAge());
			student.setCourse(newStudent.getCourse());
			
			return studentRepo.save(student);
		
				}).orElseGet(() -> {
			newStudent.setId(id);
			
			return studentRepo.save(newStudent);
		});
	
	}

	@Override
	public void deleteStudent(Integer id) {

		studentRepo.deleteById(id);

	}

}
