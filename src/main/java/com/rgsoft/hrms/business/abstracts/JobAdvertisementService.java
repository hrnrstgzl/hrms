package com.rgsoft.hrms.business.abstracts;

import java.util.List;

import com.rgsoft.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {
	public List<JobAdvertisement> findAll();
	List<JobAdvertisement> getActiveJobAdvertisements();
	List<JobAdvertisement> getActiveJobAdvertisementsSorted();
	List<JobAdvertisement> getActiveJobAdvertisementsByEmployerId(int employerId);
}
