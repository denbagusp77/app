package com.bagus.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeTypeController {
	
	@GetMapping("/employeestype")
	public String getCountries() {
		return "employeetype";
	}

}
