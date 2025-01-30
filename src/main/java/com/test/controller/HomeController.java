package com.test.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(value = "*")
@RequestMapping(value = "/")
public class HomeController {
	
	@GetMapping(value = "")
	public String home() {
		return "<html><body> <h1> Test Project </h1> </body></html>";
	}

	@GetMapping(value = "hi")
	public String hi() {
		return "hi";
	} 
	
}
