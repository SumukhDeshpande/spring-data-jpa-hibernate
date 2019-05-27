package com.springdatajpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RepositoryTestController {
	
	@GetMapping("/testMapping")
	public String testMapping() {
		return "Returned a Test Response.";
	}

}
