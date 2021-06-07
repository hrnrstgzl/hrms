package com.rgsoft.hrms.business.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.Param;

import com.rgsoft.hrms.core.utilities.results.DataResult;
import com.rgsoft.hrms.entities.concretes.JobAdvertisement;
import com.rgsoft.hrms.entities.dtos.JobAdvertisementWithEmployerDto;

public interface JobAdvertisementService {
	DataResult<List<JobAdvertisement>> findAll();
	DataResult<List<JobAdvertisement>> getActiveJobAdvertisements();
	DataResult<List<JobAdvertisement>> getActiveJobAdvertisementsSorted();
	DataResult<List<JobAdvertisement>> getActiveJobAdvertisementsByEmployerId(int employerId);
	DataResult<List<JobAdvertisementWithEmployerDto>> getJobAdvertisementWithEmployerDetails();
	DataResult<List<JobAdvertisementWithEmployerDto>> getJobAdvertisementWithEmployerDetailsByEmployerId(int id);
	DataResult<List<JobAdvertisementWithEmployerDto>> getJobAdvertisementWithEmployerDetailsByEmployerIdSorted(@Param("id") int id,Sort sort);
}
