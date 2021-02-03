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

import com.bagus.spring.entities.EmployeeType;
import com.bagus.spring.services.EmployeeTypeService;

@Controller
public class EmployeeTypeController {
	
	@Autowired private EmployeeTypeService employeeTypeService;

	//Menampilkan semua data 

	@GetMapping("/EmployeeTypes")
	public String getEmployeeType(Model model) {
		
		
		List<EmployeeType>employeeTypeList = employeeTypeService.getEmployeeTypes();
		
		model.addAttribute("EmployeeTypes", employeeTypeList);
		
		
		return "EmployeeType";
	}


	//Menambah data

	@PostMapping("/EmployeeTypes/addNew")
	public String addNew(EmployeeType employeeType) {
		employeeTypeService.save(employeeType);
		return "redirect:/EmployeeTypes";
	}	

	//mengambil/menampilkan data tertentu by id

	@RequestMapping("/EmployeeTypes/findById")
	@ResponseBody
	public Optional<EmployeeType> findById(int id) {
		return employeeTypeService.findById(id);
		
	}

	//Update Data

	@RequestMapping(value="/EmployeeTypes/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(EmployeeType employeeType) {
		employeeTypeService.save(employeeType);
		return "redirect:/EmployeeTypes";

	}

	//Delete Data By Id

		@RequestMapping(value="/EmployeeTypes/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
		public String delete(Integer id) {
			employeeTypeService.delete(id);
			return "redirect:/EmployeeTypes";
		
		}

}
