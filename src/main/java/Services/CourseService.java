package Services;

import java.util.List;

import domain.Course;

public interface CourseService {
	
	Course findStudentById(Integer id);
	
	List<Course> findAllStudents();
	
	Course saveStudent(Course student);

}
