package com.springbootMvc.myfirstwebApp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class welcomeController {

//	private AuthenticationService authenticationService;
//	
//	public loginController(AuthenticationService authenticationService) {
//		super();
//		this.authenticationService = authenticationService;
//	}

	//login
	@RequestMapping(value="/", method= RequestMethod.GET)
	public String gotoWelcomePage(ModelMap model) {
		model.put("name", getLoggedinUsername());
		return "welcome";
	}
	
	private String getLoggedinUsername() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}
	
	
//	@RequestMapping(value="login", method= RequestMethod.POST)
//	public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
//		
//		if(authenticationService.authenticate(name, password)) {
//		
//			model.put("name", name);
//			model.put("password", password);
//			return "welcome";
//		}
//		model.put("errorMessage", "Invalid Credentials");
//		return "login";
//	}
	
	//Authentication name - Akash Pal password - dummy
	
	
	
	
	
	
	
	
	
	
	
	/*
//	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@RequestMapping("login")
	public String loginJsp(@RequestParam String name, ModelMap model) { //getting value from url
		model.put("name", name);
	
//		logger.debug("Request param is {}", name);
//		logger.info("Printed in info level");
//		System.out.println("Request name is " +name); //not recommended
		
		return "login";
	} */
	
}
