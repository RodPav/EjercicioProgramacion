package Services;

import java.util.List;

import domain.Student;

public interface StudentService {
	
	Student findStudentById(Integer id);
	
	List<Student> findAllStudents();
	
	Student saveStudent(Student student);


}
