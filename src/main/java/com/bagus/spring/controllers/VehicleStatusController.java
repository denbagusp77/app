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

import com.bagus.spring.entities.VehicleStatus;
import com.bagus.spring.services.VehicleStatusService;

@Controller
public class VehicleStatusController {
	

	@Autowired private VehicleStatusService vehicleStatusService;

//Menampilkan semua data 

@GetMapping("/VehicleStatuss")
public String getVehicleStatus(Model model) {
	
	
	List<VehicleStatus>vehicleStatusList = vehicleStatusService.getVehicleStatuss();
	
	model.addAttribute("VehicleStatuss", vehicleStatusList);
	
	
	return "VehicleStatus";
}


//Menambah data

@PostMapping("/VehicleStatuss/addNew")
public String addNew(VehicleStatus vehicleStatus) {
	vehicleStatusService.save(vehicleStatus);
	return "redirect:/VehicleStatuss";
}	

//mengambil/menampilkan data tertentu by id

@RequestMapping("/VehicleStatuss/findById")
@ResponseBody
public Optional<VehicleStatus> findById(int id) {
	return vehicleStatusService.findById(id);
	
}

//Update Data

@RequestMapping(value="/VehicleStatuss/update", method= {RequestMethod.PUT, RequestMethod.GET})
public String update(VehicleStatus vehicleStatus) {
	vehicleStatusService.save(vehicleStatus);
	return "redirect:/VehicleStatuss";

}

//Delete Data By Id

	@RequestMapping(value="/VehicleStatuss/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		vehicleStatusService.delete(id);
		return "redirect:/VehicleStatuss";
	
	}

}
