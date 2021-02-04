package com.bagus.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bagus.spring.entities.JobTitle;
import com.bagus.spring.repositories.JobTitleRepository;



@Service	
public class JobTitleService {
	

	@Autowired
	private JobTitleRepository jobTitleRepository;
	
	
	//mengambil/menampilkan list data
	
	public List<JobTitle> getjobTitles(){
		return jobTitleRepository.findAll();
		
	}
	
	//Save Lokasi Baru
	public void save(JobTitle jobTitle) {
		jobTitleRepository.save(jobTitle);
	}
	
	//Mengambil data by Id
	public Optional<JobTitle> findById(int id) {
		return jobTitleRepository.findById(id);
		
	}
	
	
	//Delete By Id
	public void delete(Integer id) {
		jobTitleRepository.deleteById(id);
	}

}
