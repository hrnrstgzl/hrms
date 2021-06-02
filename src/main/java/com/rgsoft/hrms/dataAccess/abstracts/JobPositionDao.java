package com.rgsoft.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rgsoft.hrms.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer> {
	
}
