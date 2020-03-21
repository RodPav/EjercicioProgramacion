package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Services.StudentService;
import domain.Student;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping
	public List<Student> getStudents(){
		return studentService.findAllStudents();
	}
	
	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable Integer id) {
		return studentService.findStudentById(id);
	}
	
	@PostMapping
	public Student setStudent(Student student) {
		return studentService.saveStudent(student);
	}
}
