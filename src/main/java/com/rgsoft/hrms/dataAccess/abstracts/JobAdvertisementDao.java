package com.rgsoft.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.rgsoft.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer>{
	List<JobAdvertisement> getByIsActive(boolean isActive);
	List<JobAdvertisement> getByIsActive(boolean isActive,Sort sort);
	List<JobAdvertisement> getByIsActiveAndEmployer_Id(boolean isActive,int employerId);
}
