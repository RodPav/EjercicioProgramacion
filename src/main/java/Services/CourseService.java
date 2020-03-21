package Services;

import java.util.List;

import domain.Course;

public interface CourseService {
	
	Course findCourseById(Integer id);
	
	List<Course> findAllCourses();
	
	Course saveCourse(Course course);

}
