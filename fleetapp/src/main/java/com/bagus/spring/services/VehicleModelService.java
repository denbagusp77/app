package com.bagus.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bagus.spring.entities.VehicleModel;
import com.bagus.spring.repositories.VehicleModelRepository;

@Service	
public class VehicleModelService {
	

	@Autowired
	private VehicleModelRepository vehicleModelRepository;
	
	
	//mengambil/menampilkan list data
	
	public List<VehicleModel> getVehicleModels(){
		return vehicleModelRepository.findAll();
		
	}
	
	//Save Lokasi Baru
	public void save(VehicleModel vehicleModel) {
		vehicleModelRepository.save(vehicleModel);
	}
	
	//Mengambil data by Id
	public Optional<VehicleModel> findById(int id) {
		return vehicleModelRepository.findById(id);
		
	}
	
	
	//Delete By Id
	public void delete(Integer id) {
		vehicleModelRepository.deleteById(id);
	}

}
