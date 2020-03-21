package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
