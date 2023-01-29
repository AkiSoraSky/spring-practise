package com.springOne.demoPkg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age, Address address) { };
record Address(String lin1, String line2) {};

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Akash";
	}
	
	@Bean
	public int age() {
		return 15;
	}
	
	@Bean
	public Person person() {
		return new Person("Ashwani", 23, new Address("london","Uk"));
	}
	
	@Bean (name= "yourAddress")  //custom bean name
	public Address address() {
		return new Address("Noida 34","UP");
	}
	@Primary
	@Bean (name= "address2")  //custom bean name
								//when multiple bean with same type then error -> to solve @primary or @Qualifier("address")
	public Address address2() {
		return new Address("Nagpur","Maha");
	}
	
	@Bean 
	public Person person2MethodCall() { //calling existing beans by method
		return new Person(name(), age(), address()); //add @Qualifier("nameDescribed")
	}
	
	@Bean 
	public Person person3ParametersCall(String name, int age, Address address2) { //calling existing beans by parameters calling
		return new Person(name, age, address2);
	}
	
}
