package com.test.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(value = "*")
@RequestMapping(value = "api/role")
public class RoleController {
	Map<String, Object> map = new HashMap<String, Object>(){{
		put("1", "Apple");
		put("2", "Orange");
		put("3", "Grapes");
		put("4", "Guwi");
		put("5", "PineApple");
	}};

	
	@GetMapping(value = "id")
	public String getWhoAmI() {
		return map.get(String.valueOf(3)).toString();
	}	
}
