package com.bagus.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleTypeCcontroller {
	
	@GetMapping("/vehicletypes")
	public String getCountries() {
		return "vehicletype";
	}

}
