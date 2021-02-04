package com.bagus.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bagus.spring.entities.EmployeeType;
import com.bagus.spring.repositories.EmployeeTypeRepository;

@Service	
public class EmployeeTypeService {
	

	@Autowired
	private EmployeeTypeRepository employeeTypeRepository;
	
	
	//mengambil/menampilkan list data
	
	public List<EmployeeType> getEmployeeTypes(){
		return employeeTypeRepository.findAll();
		
	}
	
	//Save Lokasi Baru
	public void save(EmployeeType employeeType) {
		employeeTypeRepository.save(employeeType);
	}
	
	//Mengambil data by Id
	public Optional<EmployeeType> findById(int id) {
		return employeeTypeRepository.findById(id);
		
	}
	
	
	//Delete By Id
	public void delete(Integer id) {
		employeeTypeRepository.deleteById(id);
	}

}
