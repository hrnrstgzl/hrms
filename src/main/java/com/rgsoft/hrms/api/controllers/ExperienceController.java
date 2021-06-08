package com.rgsoft.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rgsoft.hrms.business.abstracts.ExperienceService;
import com.rgsoft.hrms.core.utilities.results.DataResult;
import com.rgsoft.hrms.core.utilities.results.Result;
import com.rgsoft.hrms.entities.concretes.Experience;

@RestController
@RequestMapping("/api/experiences/")
public class ExperienceController {
	private ExperienceService experienceService;

	@Autowired
	public ExperienceController(ExperienceService experienceService) {
		super();
		this.experienceService = experienceService;
	}
	
	@PostMapping("add")
	public Result add(Experience experience) {
		return this.experienceService.add(experience);
	}
	
	@GetMapping("getAll")
	public DataResult<List<Experience>> getAll(){
		return this.experienceService.getAll();
	}
	
	@GetMapping("getByResumeId")
	public DataResult<List<Experience>> getByResumeId(@RequestParam int id){
		return this.experienceService.getByResume_Id(id);
	}
	
	@GetMapping("getByResumeIdSorted")
	public DataResult<List<Experience>> getByResumeIdSorted(@RequestParam int id,@RequestParam String sortBy){
		Sort sort = Sort.by(Sort.Direction.DESC,sortBy); 
		return this.experienceService.getByResume_IdSorted(id,sort);
	}
	
	
}
