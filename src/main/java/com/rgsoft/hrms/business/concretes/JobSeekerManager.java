package com.rgsoft.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgsoft.hrms.business.abstracts.JobSeekerService;
import com.rgsoft.hrms.dataAccess.abstracts.JobSeekerDao;
import com.rgsoft.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService {
	private JobSeekerDao jobSeekerDao;

	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		super();
		this.jobSeekerDao = jobSeekerDao;
	}

	@Override
	public boolean add(JobSeeker jobSeeker) {
		this.jobSeekerDao.save(jobSeeker);
		return true;
	}
	
	
	
	
}
