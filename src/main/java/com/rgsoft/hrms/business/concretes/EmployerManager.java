package com.rgsoft.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgsoft.hrms.business.abstracts.EmployerService;
import com.rgsoft.hrms.dataAccess.abstracts.EmployerDao;
import com.rgsoft.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {
	private EmployerDao employerDao;

	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}
	
	@Override
	public boolean add(Employer employer) {
		this.employerDao.save(employer);
		return true;
	}

	@Override
	public List<Employer> findAll() {
		return this.employerDao.findAll();
	}

	
	
	
}
