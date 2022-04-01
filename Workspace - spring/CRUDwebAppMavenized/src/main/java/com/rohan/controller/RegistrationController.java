package com.rohan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.rohan.dto.Student;
import com.rohan.service.registrationService;

@Controller
public class RegistrationController
{
	
	@Autowired
	private registrationService service;
	@RequestMapping("/register")
	public void add(Student student)
	{
		System.out.println("add method inside controller");
		service.add(student);
	}
}
