package com.rgsoft.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgsoft.hrms.business.abstracts.EmployerService;
import com.rgsoft.hrms.core.utilities.results.DataResult;
import com.rgsoft.hrms.core.utilities.results.Result;
import com.rgsoft.hrms.core.utilities.results.SuccessDataResult;
import com.rgsoft.hrms.core.utilities.results.SuccessResult;
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
	public Result add(Employer employer) {
		this.employerDao.save(employer);
		return new SuccessResult("Kayıt başarılı");
	}

	@Override
	public DataResult<List<Employer>> findAll() {
		List<Employer> result =  this.employerDao.findAll();
		return new SuccessDataResult<>(result,"Veriler başarı ile listelendi");
	}

	
	
	
}
