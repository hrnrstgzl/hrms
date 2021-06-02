package com.rgsoft.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rgsoft.hrms.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer> {
	
}
