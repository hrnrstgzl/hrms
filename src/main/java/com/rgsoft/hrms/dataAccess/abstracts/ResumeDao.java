package com.rgsoft.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rgsoft.hrms.entities.concretes.Resume;

public interface ResumeDao extends JpaRepository<Resume, Integer> {
	public Resume findById(int id);
	public Resume findByJobSeeker_Id(int id);
}
