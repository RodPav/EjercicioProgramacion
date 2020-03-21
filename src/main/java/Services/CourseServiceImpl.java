package Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import domain.Course;
import repositories.CourseRepository;

public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepo;
	
	@Override
	public Course findStudentById(Integer id) {
		return courseRepo.findById(id).get();
	}

	@Override
	public List<Course> findAllStudents() {
		return courseRepo.findAll();
	}

	@Override
	public Course saveStudent(Course course) {
		return courseRepo.save(course);
	}

}
