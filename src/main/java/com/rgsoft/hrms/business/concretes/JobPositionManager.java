package com.rgsoft.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgsoft.hrms.business.abstracts.JobPositionService;
import com.rgsoft.hrms.dataAccess.abstracts.JobPositionDao;
import com.rgsoft.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {
	private JobPositionDao jobPositionDao;
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}
	@Override
	public List<JobPosition> findAll() {
		List<JobPosition> result = this.jobPositionDao.findAll();
		return result;
	}
	
}
