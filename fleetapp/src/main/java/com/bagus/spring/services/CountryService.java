package com.bagus.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bagus.spring.entities.Country;
import com.bagus.spring.repositories.CountryRepository;

@Service	
public class CountryService {
	
	@Autowired
	private CountryRepository countryRepository;
	
	//Return list of countries
	public List<Country> getCountries(){
			return countryRepository.findAll();
	}
	
	//Update Country
		public void save(Country country) {
			countryRepository.save(country);
		}
		
	//Get by id 
		public Optional<Country> finById(int id) {
			return countryRepository.findById(id);
			
		}

		//Get by id 
		public void delete(Integer id) {
			countryRepository.deleteById(id);
			
		}

}
