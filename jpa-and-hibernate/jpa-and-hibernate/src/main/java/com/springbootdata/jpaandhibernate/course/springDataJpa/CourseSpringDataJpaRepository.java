package com.springbootdata.jpaandhibernate.course.springDataJpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootdata.jpaandhibernate.Course;


public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

	//custom method
	List<Course> findByAuthor(String author);
	
	List<Course> findByName(String name);
}
