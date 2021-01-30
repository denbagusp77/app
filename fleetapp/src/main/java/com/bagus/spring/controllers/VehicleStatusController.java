package com.bagus.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleStatusController {
	
	@GetMapping("/vehiclestatuss")
	public String getCountries() {
		return "vehiclestatus";
	}

}
