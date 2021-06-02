package com.rgsoft.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rgsoft.hrms.business.abstracts.JobSeekerService;
import com.rgsoft.hrms.entities.concretes.JobSeeker;

@RestController
@RequestMapping("/api/jobseekers/")
public class JobSeekersController {
	
	private JobSeekerService jobSeekerService;
	
	@Autowired
	public JobSeekersController(JobSeekerService jobSeekerService) {
		super();
		this.jobSeekerService = jobSeekerService;
	}
	
	@PostMapping("add")
	public boolean add(@RequestBody JobSeeker jobSeeker) {
		this.jobSeekerService.add(jobSeeker);
		return true;
	}
	
	@GetMapping("getAll")
	public List<JobSeeker> getAll(){
		return this.jobSeekerService.findAll();
	}
}
