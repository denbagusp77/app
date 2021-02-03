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

import com.bagus.spring.entities.VehicleType;
import com.bagus.spring.services.VehicleTypeService;

@Controller
public class VehicleTypeController {
	

	@Autowired private VehicleTypeService vehicleTypeService;

//Menampilkan semua data 

@GetMapping("/VehicleTypes")
public String getVehicleType(Model model) {
	
	
	List<VehicleType>vehicleTypeList = vehicleTypeService.getVehicleTypes();
	
	model.addAttribute("VehicleTypes", vehicleTypeList);
	
	
	return "VehicleType";
}


//Menambah data

@PostMapping("/VehicleTypes/addNew")
public String addNew(VehicleType vehicleType) {
	vehicleTypeService.save(vehicleType);
	return "redirect:/VehicleTypes";
}	

//mengambil/menampilkan data tertentu by id

@RequestMapping("/VehicleTypes/findById")
@ResponseBody
public Optional<VehicleType> findById(int id) {
	return vehicleTypeService.findById(id);
	
}

//Update Data

@RequestMapping(value="/VehicleTypes/update", method= {RequestMethod.PUT, RequestMethod.GET})
public String update(VehicleType vehicleType) {
	vehicleTypeService.save(vehicleType);
	return "redirect:/VehicleTypes";

}

//Delete Data By Id

	@RequestMapping(value="/VehicleTypes/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		vehicleTypeService.delete(id);
		return "redirect:/VehicleTypes";
	
	}

}
