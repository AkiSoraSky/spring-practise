package com.springOne.demoPkg;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		//1. launch a Spring Context
		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)
				) {
		//2. Configure the things that we want Spring to manage - 1 -> 
		// @Configuration
		
		//3. Retrieving beans managed by Spring
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("yourAddress"));
		
		System.out.println(context.getBean(Address.class)); //Retrieve by class type
		
		System.out.println(context.getBean("person2MethodCall"));
		System.out.println(context.getBean("person3ParametersCall"));
			
//		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println); //list of all beans
	
		};
		}

}
