package com.springOne.demoPkg.examples.a1;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass {
	
//	@Autowired //auto-wiring by field injection
	Dependency1 dependency1;
	

//	@Autowired
	Dependency2 dependency2;

	/*
	public Dependency1 getDependency1() {
		return dependency1;
	}
	
	@Autowired
	public void setDependency1(Dependency1 dependency1) {
		System.out.println("setter1 Injection");
		this.dependency1 = dependency1;
	}

	public Dependency2 getDependency2() {
		return dependency2;
	}

	@Autowired
	public void setDependency2(Dependency2 dependency2) {
		System.out.println("setter2 Injection");
		this.dependency2 = dependency2;
	}
*/
	
	
	
	@Override
	public String toString() {
		return "YourBusinessClass [dependency1=" + dependency1 + ", dependency2=" + dependency2 + "]";
	}

	//@Autowired
	public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		System.out.println("Const Injection");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}
	
	
}

@Component
class Dependency1 {
	
}

@Component
class Dependency2 {
	
}

@Configuration
@ComponentScan
public class DepInjectionLauncherApp {
  
	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApp.class)) {
		
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		System.out.println(context.getBean(YourBusinessClass.class));
		}
	}
}
