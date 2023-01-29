package com.springbootdata.jpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springbootdata.jpaandhibernate.Course;

//@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseJdbcRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1, "Learn AWS", "Amazon.in"));
		repository.insert(new Course(2, "Full Stack", "Udemy"));
		repository.insert(new Course(3, "Java Developer", "Udemy"));
		repository.insert(new Course(4, "Web Developer", "Udemy"));

		
//		repository.deleteById(1);
		
		System.out.println(repository.findById(2));
		System.out.println(repository.findById(3));
	}

}
