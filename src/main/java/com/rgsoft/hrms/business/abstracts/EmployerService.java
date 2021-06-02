package com.rgsoft.hrms.business.abstracts;

import java.util.List;

import com.rgsoft.hrms.entities.concretes.Employer;

public interface EmployerService {
	public boolean add(Employer employer);
	public List<Employer> findAll();
}
