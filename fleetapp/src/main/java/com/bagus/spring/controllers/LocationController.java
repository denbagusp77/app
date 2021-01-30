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

import com.bagus.spring.entities.Country;
import com.bagus.spring.entities.Location;
import com.bagus.spring.entities.State;
import com.bagus.spring.services.CountryService;
import com.bagus.spring.services.LocationService;
import com.bagus.spring.services.StateService;

@Controller
public class LocationController {
	
	@Autowired private StateService stateService;
	@Autowired private LocationService locationService;
	@Autowired private CountryService countryService;
	
	//Menampilkan semua data 
	
	@GetMapping("/locations")
	public String getStates(Model model) {
		
		List<State>stateList = stateService.getStates();
		List<Country> countryList = countryService.getCountries();
		List<Location>locationList = locationService.getLocations();
		
		
		model.addAttribute("states", stateList);
		model.addAttribute("countries", countryList);
		model.addAttribute("locations", locationList);
		
		
		return "location";
	}
	

	//Menambah data
	
	@PostMapping("/locations/addNew")
	public String addNew(Location location) {
		locationService.save(location);
		return "redirect:/locations";
	}	
	
	//mengambil/menampilkan data tertentu by id
	
	@RequestMapping("/locations/findById")
	@ResponseBody
	public Optional<Location> findById(int id) {
		return locationService.findById(id);
		
	}
	
	//Update Data
	
	@RequestMapping(value="/locations/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(Location location) {
		locationService.save(location);
		return "redirect:/locations";
	
	}
	
	//Delete Data By Id
	
		@RequestMapping(value="/locations/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
		public String delete(Integer id) {
			locationService.delete(id);
			return "redirect:/locations";
		
		}
	
}
