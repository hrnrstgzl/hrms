package com.rgsoft.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rgsoft.hrms.business.abstracts.JobAdvertisementService;
import com.rgsoft.hrms.core.utilities.results.DataResult;
import com.rgsoft.hrms.entities.concretes.JobAdvertisement;
import com.rgsoft.hrms.entities.dtos.JobAdvertisementWithEmployerDto;

@RestController
@RequestMapping("/api/jobadvertisemens/")
public class JobAdvertisementController {
	
	private JobAdvertisementService jobAdvertisementService;
	
	@Autowired
	public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	@GetMapping("getAll")
	public DataResult<List<JobAdvertisement>> getAll(){
		return this.jobAdvertisementService.findAll();
	}
	
	@GetMapping("getActiveJobAdvertisements")
	public DataResult<List<JobAdvertisement>> getActiveJobAdvertisements(){
		return this.jobAdvertisementService.getActiveJobAdvertisements();
	}
	
	@GetMapping("getActiveJobAdvertisementsSorted")
	public DataResult<List<JobAdvertisement>> getActiveJobAdvertisementsSorted(){
		return this.jobAdvertisementService.getActiveJobAdvertisementsSorted();
	}
	
	@GetMapping("getActiveJobAdvertisementsByEmployerId")
	public DataResult<List<JobAdvertisement>> getActiveJobAdvertisementsByEmployerId(@RequestParam int employerId){
		return this.jobAdvertisementService.getActiveJobAdvertisementsByEmployerId(employerId);
	}
	
	@GetMapping("getJobAdvertisementWithEmployerDetails")
	DataResult<List<JobAdvertisementWithEmployerDto>> getJobAdvertisementWithEmployerDetails(){
		return this.jobAdvertisementService.getJobAdvertisementWithEmployerDetails();
	}
	
	@GetMapping("getJobAdvertisementWithEmployerDetailsByEmployerId")
	DataResult<List<JobAdvertisementWithEmployerDto>> getJobAdvertisementWithEmployerDetailsByEmployerId(@RequestParam int employerId){
		return this.jobAdvertisementService.getJobAdvertisementWithEmployerDetailsByEmployerId(employerId);
	}
	
	@GetMapping("getJobAdvertisementWithEmployerDetailsByEmployerIdSortByReleaseDate")
	DataResult<List<JobAdvertisementWithEmployerDto>>  getJobAdvertisementWithEmployerDetailsByEmployerIdSortByReleaseDate(@RequestParam int employerId){
		return this.jobAdvertisementService.getJobAdvertisementWithEmployerDetailsByEmployerIdSorted(employerId,Sort.by("releaseDate"));
	}
}
