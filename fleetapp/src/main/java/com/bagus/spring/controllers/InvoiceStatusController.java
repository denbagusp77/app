package com.bagus.spring.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bagus.spring.entities.InvoiceStatus;
import com.bagus.spring.services.InvoiceStatusService;

@Controller
public class InvoiceStatusController {
	

	@Autowired private InvoiceStatusService invoiceStatusService;

//Menampilkan semua data 

@GetMapping("/InvoiceStatuss")
public String getInvoiceStatus(Model model) {
	
	
	List<InvoiceStatus>invoiceStatusList = invoiceStatusService.getInvoiceStatuss();
	
	model.addAttribute("InvoiceStatuss", invoiceStatusList);
	
	
	return "InvoiceStatus";
}


//Menambah data

@PostMapping("/InvoiceStatuss/addNew")
public String addNew(InvoiceStatus invoiceStatus) {
	invoiceStatusService.save(invoiceStatus);
	return "redirect:/InvoiceStatuss";
}	

//mengambil/menampilkan data tertentu by id

@RequestMapping("/InvoiceStatuss/findById")
@ResponseBody
public Optional<InvoiceStatus> findById(int id) {
	return invoiceStatusService.findById(id);
	
}

//Update Data

@RequestMapping(value="/InvoiceStatuss/update", method= {RequestMethod.PUT, RequestMethod.GET})
public String update(InvoiceStatus invoiceStatus) {
	invoiceStatusService.save(invoiceStatus);
	return "redirect:/InvoiceStatuss";

}

//Delete Data By Id

	@RequestMapping(value="/InvoiceStatuss/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		invoiceStatusService.delete(id);
		return "redirect:/InvoiceStatuss";
	
	}

}
