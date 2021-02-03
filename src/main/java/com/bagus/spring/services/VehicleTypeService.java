package com.bagus.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bagus.spring.entities.VehicleType;
import com.bagus.spring.repositories.VehicleTypeRepository;

@Service	
public class VehicleTypeService {
	

	@Autowired
	private VehicleTypeRepository vehicleTypeRepository;
	
	
	//mengambil/menampilkan list data
	
	public List<VehicleType> getVehicleTypes(){
		return vehicleTypeRepository.findAll();
		
	}
	
	//Save Data Baru
	public void save(VehicleType vehicleType) {
		vehicleTypeRepository.save(vehicleType);
	}
	
	//Mengambil data by Id
	public Optional<VehicleType> findById(int id) {
		return vehicleTypeRepository.findById(id);
		
	}
	
	
	//Delete By Id
	public void delete(Integer id) {
		vehicleTypeRepository.deleteById(id);
	}

}
