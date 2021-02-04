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

import com.bagus.spring.entities.VehicleModel;
import com.bagus.spring.services.VehicleModelService;

@Controller
public class VehicleModelController {
	

	@Autowired private VehicleModelService vehicleModelService;

//Menampilkan semua data 

@GetMapping("/VehicleModels")
public String getVehicleModel(Model model) {
	
	
	List<VehicleModel>vehicleModelList = vehicleModelService.getVehicleModels();
	
	model.addAttribute("VehicleModels", vehicleModelList);
	
	
	return "VehicleModel";
}


//Menambah data

@PostMapping("/VehicleModels/addNew")
public String addNew(VehicleModel vehicleModel) {
	vehicleModelService.save(vehicleModel);
	return "redirect:/VehicleModels";
}	

//mengambil/menampilkan data tertentu by id

@RequestMapping("/VehicleModels/findById")
@ResponseBody
public Optional<VehicleModel> findById(int id) {
	return vehicleModelService.findById(id);
	
}

//Update Data

@RequestMapping(value="/VehicleModels/update", method= {RequestMethod.PUT, RequestMethod.GET})
public String update(VehicleModel vehicleModel) {
	vehicleModelService.save(vehicleModel);
	return "redirect:/VehicleModels";

}

//Delete Data By Id

	@RequestMapping(value="/VehicleModels/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		vehicleModelService.delete(id);
		return "redirect:/VehicleModels";
	
	}

}
