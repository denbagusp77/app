package com.bagus.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bagus.spring.entities.Location;
import com.bagus.spring.repositories.LocationRepository;

@Service	
public class LocationService {
	
	@Autowired
	private LocationRepository locationRepository;
	
	
	//mengambil/menampilkan list data
	
	public List<Location> getLocations(){
		return locationRepository.findAll();
		
	}
	
	//Save Lokasi Baru
	public void save(Location location) {
		locationRepository.save(location);
	}
	
	//Mengambil data by Id
	public Optional<Location> findById(int id) {
		return locationRepository.findById(id);
		
	}
	
	
	//Delete By Id
	public void delete(Integer id) {
		locationRepository.deleteById(id);
	}

}
