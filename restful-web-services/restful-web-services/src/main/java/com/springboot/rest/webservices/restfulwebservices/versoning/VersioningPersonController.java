package com.springboot.rest.webservices.restfulwebservices.versoning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {
//uri versioning - twitter
	@GetMapping("/v1/person") 
	public PersonV1 getFirstVerionOfPerson() {
		return new PersonV1("Bob Singh");
	}

	@GetMapping("/v2/person") 
	public PersonV2 getSecondVerionOfPerson() {
		return new PersonV2(new Name("Boby", "Singh"));
	}
//Request param - Amazon
	@GetMapping(path = "/person", params = "version=1") 
	public PersonV1 getFirstVerionOfPersonRequestParameter() {
		return new PersonV1("Boby ji Singh");
	}
//Versioning by headers - Microsoft
	@GetMapping(path = "/person/header", headers = "X-API-VERSION=1") 
	public PersonV1 getFirstVerionOfPersonRequestHeader() {
		return new PersonV1("Bob Charlie");
	}
	
//media type versioning aka content negotiation or accept header - Github
	@GetMapping(path = "/person/header", produces = "application/vnd.company.app-v1+json") 
	public PersonV1 getFirstVerionOfPersonAcceptHeader() {
		return new PersonV1("Bob Charlie");
	}
	
}
