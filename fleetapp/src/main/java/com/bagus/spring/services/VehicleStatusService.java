package com.bagus.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bagus.spring.entities.VehicleStatus;
import com.bagus.spring.repositories.VehicleStatusRepository;

@Service	
public class VehicleStatusService {
	

	@Autowired
	private VehicleStatusRepository vehicleStatusRepository;
	
	
	//mengambil/menampilkan list data
	
	public List<VehicleStatus> getVehicleStatuss(){
		return vehicleStatusRepository.findAll();
		
	}
	
	//Save Lokasi Baru
	public void save(VehicleStatus vehicleStatus) {
		vehicleStatusRepository.save(vehicleStatus);
	}
	
	//Mengambil data by Id
	public Optional<VehicleStatus> findById(int id) {
		return vehicleStatusRepository.findById(id);
		
	}
	
	
	//Delete By Id
	public void delete(Integer id) {
		vehicleStatusRepository.deleteById(id);
	}

}
