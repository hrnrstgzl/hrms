package com.rgsoft.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.rgsoft.hrms.entities.concretes.Education;

public interface EducationDao extends JpaRepository<Education, Integer>{
	public List<Education> getByResume_Id(int id);
	public List<Education> getByResume_Id(int id,Sort sort);
}
