package com.bagus.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bagus.spring.entities.VehicleMake;
import com.bagus.spring.repositories.VehicleMakeRepository;

@Service	
public class VehicleMakeService {
	
	@Autowired
	private VehicleMakeRepository vehicleMakeRepository;
	
	
	//mengambil/menampilkan list data
	
	public List<VehicleMake> getVehicleMakes(){
		return vehicleMakeRepository.findAll();
		
	}
	
	//Save Lokasi Baru
	public void save(VehicleMake vehicleMake) {
		vehicleMakeRepository.save(vehicleMake);
	}
	
	//Mengambil data by Id
	public Optional<VehicleMake>findById(int id) {
		return vehicleMakeRepository.findById(id);
		
	}
	
	
	//Delete By Id
	public void delete(Integer id) {
		vehicleMakeRepository.deleteById(id);
	}


}
