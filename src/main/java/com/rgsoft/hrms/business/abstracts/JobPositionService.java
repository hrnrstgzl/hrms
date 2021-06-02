package com.rgsoft.hrms.business.abstracts;

import java.util.List;

import com.rgsoft.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	public List<JobPosition> findAll();
	public boolean add(JobPosition jobPosition);
}
