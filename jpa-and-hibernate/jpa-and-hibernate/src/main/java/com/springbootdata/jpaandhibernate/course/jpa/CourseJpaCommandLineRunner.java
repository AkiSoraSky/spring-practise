package com.springbootdata.jpaandhibernate.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springbootdata.jpaandhibernate.Course;

//@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner{

	@Autowired
	private CourseJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1, "Learn AWS Jpa", "Amazon.in"));
		repository.insert(new Course(2, "Full Stack Jpa", "Udemy"));
		repository.insert(new Course(3, "Java Developer Jpa", "Udemy"));
		repository.insert(new Course(4, "Web Developer Jpa", "Udemy"));

		
//		repository.deleteById(1);
		
		System.out.println(repository.findById(2));
		System.out.println(repository.findById(3));
	}
}
