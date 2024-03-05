package com.swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.swagger.service.StudentService;

@RestController
public class StudentController {
	
	
	private StudentService studService;

	@GetMapping
	public String test() {
		return "Swagger";	
	}
	
	@PostMapping("/save")
	public String saveStudentName() {
		return "sonu";
		
	}
	

	public String saveStudent(@RequestParam("name")String name,
			@RequestParam("city")String city,
			@RequestParam("email")String email,
			@RequestParam("mobile")Long mobile) {
				
				studService.save();
				
				return null;
				
				
		
	}
	
}

