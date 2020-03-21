package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Services.CourseService;
import domain.Course;

@RestController
@RequestMapping("/Courses")
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@GetMapping
	public List<Course> getCourses(){
		return courseService.findAllCourses();
	}
	
	@GetMapping("/{id}")
	public Course getCourseById(@PathVariable Integer id) {
		return courseService.findCourseById(id);
	}
	
	@PostMapping
	public Course setCourse(Course Course) {
		return courseService.saveCourse(Course);
	}
}
