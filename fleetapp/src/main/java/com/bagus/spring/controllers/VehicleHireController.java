package com.bagus.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleHireController {
	
	@GetMapping("/vehicleshire")
	public String getCountries() {
		return "vehiclehire";
	}

}
