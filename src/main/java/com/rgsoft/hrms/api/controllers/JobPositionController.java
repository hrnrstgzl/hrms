package com.rgsoft.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rgsoft.hrms.business.abstracts.JobPositionService;
import com.rgsoft.hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobPositions/")
public class JobPositionController {
	private JobPositionService jobPositionService;
	@Autowired
	public JobPositionController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	
	@GetMapping("getAll")
	public List<JobPosition> findAll(){
		return this.jobPositionService.findAll();
	}
	
}
