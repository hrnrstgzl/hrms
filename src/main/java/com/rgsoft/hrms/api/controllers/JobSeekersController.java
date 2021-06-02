package com.rgsoft.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rgsoft.hrms.business.concretes.JobSeekerManager;
import com.rgsoft.hrms.entities.concretes.JobSeeker;

@RestController
@RequestMapping("/api/jobseekers/")
public class JobSeekersController {
	
	private JobSeekerManager jobSeekerManager;
	
	@Autowired
	public JobSeekersController(JobSeekerManager jobSeekerManager) {
		super();
		this.jobSeekerManager = jobSeekerManager;
	}
	
	@PostMapping("add")
	public boolean add(@RequestBody JobSeeker jobSeeker) {
		this.jobSeekerManager.add(jobSeeker);
		return true;
	}
	
}
