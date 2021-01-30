package com.bagus.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InvoiceStatusController {
	
	@GetMapping("/invoicestatuss")
	public String getCountries() {
		return "invoicestatus";
	}

}
