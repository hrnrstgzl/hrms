package com.rgsoft.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rgsoft.hrms.business.abstracts.EducationService;
import com.rgsoft.hrms.core.utilities.results.DataResult;
import com.rgsoft.hrms.core.utilities.results.Result;
import com.rgsoft.hrms.entities.concretes.Education;

@RestController
@RequestMapping("/api/educations/")
public class EducationController {

	private EducationService educationService;

	@Autowired
	public EducationController(EducationService educationService) {
		super();
		this.educationService = educationService;
	}
	
	@GetMapping("getAll")
	public DataResult<List<Education>> getAll(){
		return this.educationService.getAll();
	}
	@GetMapping("getByResumeId")
	public DataResult<List<Education>> getByResumeId(@RequestParam int id){
		return this.educationService.getByResume_Id(id);
	}
	
	@PostMapping("add")
	public Result add(Education education) {
		return this.educationService.add(education);
	}
	
	
}
