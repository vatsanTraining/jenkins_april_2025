package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	
	@GetMapping(path = "/")
	public String getMessage() {
		
		return "Hello world";
	}
	
	@GetMapping(params = "/hello")
public String getThanksMessage() {
		
		return "Thank you";
	}
	
}
