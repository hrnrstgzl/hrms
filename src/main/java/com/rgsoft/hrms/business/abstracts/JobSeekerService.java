package com.rgsoft.hrms.business.abstracts;

import java.util.List;

import com.rgsoft.hrms.entities.concretes.JobSeeker;

public interface JobSeekerService {
	public boolean add(JobSeeker jobSeeker); 
	public List<JobSeeker> findAll();
}
