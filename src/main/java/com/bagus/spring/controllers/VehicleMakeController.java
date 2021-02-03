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


import com.bagus.spring.entities.VehicleMake;
import com.bagus.spring.services.VehicleMakeService;

@Controller
public class VehicleMakeController {

	@Autowired private VehicleMakeService vehicleMakeService;

//Menampilkan semua data 

@GetMapping("/VehicleMakes")
public String getVehicleMake(Model model) {
	
	
	List<VehicleMake>vehicleMakeList = vehicleMakeService.getVehiclesMake();
	
	model.addAttribute("VehicleMakes", vehicleMakeList);
	
	
	return "vehiclemake";
}


//Menambah data

@PostMapping("/VehicleMakes/addNew")
public String addNew(VehicleMake vehicleMake) {
	vehicleMakeService.save(vehicleMake);
	return "redirect:/VehicleMakes";
}	

//mengambil/menampilkan data tertentu by id

@RequestMapping("/VehicleMakes/findById")
@ResponseBody
public Optional<VehicleMake> findById(int id) {
	return vehicleMakeService.findById(id);
	
}

//Update Data

@RequestMapping(value="/VehicleMakes/update", method= {RequestMethod.PUT, RequestMethod.GET})
public String update(VehicleMake VehicleMake) {
	vehicleMakeService.save(VehicleMake);
	return "redirect:/VehicleMakes";

}

//Delete Data By Id

	@RequestMapping(value="/VehicleMakes/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		vehicleMakeService.delete(id);
		return "redirect:/VehicleMakes";
	
	}

}
