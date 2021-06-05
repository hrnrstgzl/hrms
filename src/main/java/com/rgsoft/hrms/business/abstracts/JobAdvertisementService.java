package com.rgsoft.hrms.business.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.Param;

import com.rgsoft.hrms.entities.concretes.JobAdvertisement;
import com.rgsoft.hrms.entities.dtos.JobAdvertisementWithEmployerDto;

public interface JobAdvertisementService {
	public List<JobAdvertisement> findAll();
	List<JobAdvertisement> getActiveJobAdvertisements();
	List<JobAdvertisement> getActiveJobAdvertisementsSorted();
	List<JobAdvertisement> getActiveJobAdvertisementsByEmployerId(int employerId);
	List<JobAdvertisementWithEmployerDto> getJobAdvertisementWithEmployerDetails();
	List<JobAdvertisementWithEmployerDto> getJobAdvertisementWithEmployerDetailsByEmployerId(int id);
	List<JobAdvertisementWithEmployerDto> getJobAdvertisementWithEmployerDetailsByEmployerIdSorted(@Param("id") int id,Sort sort);
}
