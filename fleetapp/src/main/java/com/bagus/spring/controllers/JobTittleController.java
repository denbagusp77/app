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


import com.bagus.spring.entities.JobTitle;
import com.bagus.spring.services.JobTitleService;

@Controller
public class JobTittleController {
	
	@Autowired private JobTitleService jobTitleService;

//Menampilkan semua data 

@GetMapping("/JobTitles")
public String getJobTitle(Model model) {
	
	
	List<JobTitle>jobTitleList = jobTitleService.getjobTitles();
	
	model.addAttribute("JobTitles", jobTitleList);
	
	
	return "JobTitle";
}


//Menambah data

@PostMapping("/JobTitles/addNew")
public String addNew(JobTitle JobTitle) {
	jobTitleService.save(JobTitle);
	return "redirect:/JobTitles";
}	

//mengambil/menampilkan data tertentu by id

@RequestMapping("/JobTitles/findById")
@ResponseBody
public Optional<JobTitle> findById(int id) {
	return jobTitleService.findById(id);
	
}

//Update Data

@RequestMapping(value="/JobTitles/update", method= {RequestMethod.PUT, RequestMethod.GET})
public String update(JobTitle JobTitle) {
	jobTitleService.save(JobTitle);
	return "redirect:/JobTitles";

}

//Delete Data By Id

	@RequestMapping(value="/JobTitles/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		jobTitleService.delete(id);
		return "redirect:/JobTitles";
	
	}
	
}
