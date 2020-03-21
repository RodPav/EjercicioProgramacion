package Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.Course;
import repositories.CourseRepository;

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
		return courseRepo.findAll();
	}

	@Override
	public Course saveCourse(Course course) {
		return courseRepo.save(course);
	}

}
