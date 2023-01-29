package com.springbootdata.jpaandhibernate.course.springDataJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springbootdata.jpaandhibernate.Course;

@Component
public class CourseSpringJpaCommandLineRunner implements CommandLineRunner{

	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1, "Learn AWS Spring Jpa", "Amazon.in"));
		repository.save(new Course(2, "Full Stack Spring Jpa", "Udemy"));
		repository.save(new Course(3, "Java Developer Spring Jpa", "Udemy"));
		repository.save(new Course(4, "Web Developer Spring Jpa", "Udemy"));

		
//		repository.deleteById(1L);
		
		System.out.println(repository.findById(2L));
		System.out.println(repository.findById(3L));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		System.out.println(repository.findByAuthor("Amazon.in"));
		System.out.println(repository.findByName("Full Stack Spring Jpa"));
	}
}
