package com.rgsoft.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.rgsoft.hrms.business.abstracts.JobAdvertisementService;
import com.rgsoft.hrms.core.utilities.results.DataResult;
import com.rgsoft.hrms.core.utilities.results.SuccessDataResult;
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
	public DataResult<List<JobAdvertisement>> findAll() {
		List<JobAdvertisement> result = this.jobAdvertisementDao.findAll();
		return new SuccessDataResult<List<JobAdvertisement>>(result,"Sonuçlar Listelendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getActiveJobAdvertisements() {
		List<JobAdvertisement> result = this.jobAdvertisementDao.getByIsActive(true);
		return new SuccessDataResult<List<JobAdvertisement>>(result,"Sonuçlar Listelendi");
	}
	
	public DataResult<List<JobAdvertisement>> getActiveJobAdvertisementsSorted(){
		Sort sort = Sort.by(Sort.Direction.DESC,"releaseDate");
		List<JobAdvertisement> result = this.jobAdvertisementDao.getByIsActive(true,sort);
		return new SuccessDataResult<List<JobAdvertisement>>(result,"Sonuçlar Listelendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getActiveJobAdvertisementsByEmployerId(int employerId) {
		List<JobAdvertisement> result =  this.jobAdvertisementDao.getByIsActiveAndEmployer_Id(true, employerId);
		return new SuccessDataResult<List<JobAdvertisement>>(result,"Sonuçlar Listelendi");
	}

	@Override
	public DataResult<List<JobAdvertisementWithEmployerDto>> getJobAdvertisementWithEmployerDetails() {
		List<JobAdvertisementWithEmployerDto> result = this.jobAdvertisementDao.getJobAdvertisementWithEmployerDetails();
		return new SuccessDataResult<List<JobAdvertisementWithEmployerDto>>(result,"Sonuçlar Listelendi");
	}
	
	public DataResult<List<JobAdvertisementWithEmployerDto>> getJobAdvertisementWithEmployerDetailsByEmployerId(int id){
		List<JobAdvertisementWithEmployerDto> result = this.jobAdvertisementDao.getJobAdvertisementWithEmployerDetailsByEmployerId(id);
		return new SuccessDataResult<List<JobAdvertisementWithEmployerDto>>(result,"Sonuçlar Listelendi");
	}
	
	public DataResult<List<JobAdvertisementWithEmployerDto>> getJobAdvertisementWithEmployerDetailsByEmployerIdSorted(@Param("id") int id,Sort sort){
		return new SuccessDataResult<List<JobAdvertisementWithEmployerDto>>(this.jobAdvertisementDao.getJobAdvertisementWithEmployerDetailsByEmployerIdSorted(id, sort),"Data listeleme başarılı");
	}

		
}
