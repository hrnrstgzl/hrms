package com.rgsoft.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.rgsoft.hrms.business.abstracts.JobAdvertisementService;
import com.rgsoft.hrms.dataAccess.abstracts.JobAdvertisementDao;
import com.rgsoft.hrms.entities.concretes.JobAdvertisement;
import com.rgsoft.hrms.entities.dtos.JobAdvertisementWithEmployerDto;

@Service
public class JobAdvertisementManager implements JobAdvertisementService{
	private JobAdvertisementDao jobAdvertisementDao;

	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public List<JobAdvertisement> findAll() {
		return this.jobAdvertisementDao.findAll();
	}

	@Override
	public List<JobAdvertisement> getActiveJobAdvertisements() {
		return this.jobAdvertisementDao.getByIsActive(true);
	}
	public List<JobAdvertisement> getActiveJobAdvertisementsSorted(){
		Sort sort = Sort.by(Sort.Direction.DESC,"releaseDate");
		return this.jobAdvertisementDao.getByIsActive(true,sort);
	}

	@Override
	public List<JobAdvertisement> getActiveJobAdvertisementsByEmployerId(int employerId) {
		return this.jobAdvertisementDao.getByIsActiveAndEmployer_Id(true, employerId);
	}

	@Override
	public List<JobAdvertisementWithEmployerDto> getJobAdvertisementWithEmployerDetails() {
		return this.jobAdvertisementDao.getJobAdvertisementWithEmployerDetails();
	}

	
}
