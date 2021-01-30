package com.bagus.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JobTittleController {
	
	@GetMapping("/jobtitles")
	public String getCountries() {
		return "jobtitle";
	}

}
