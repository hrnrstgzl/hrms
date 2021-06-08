package com.rgsoft.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.rgsoft.hrms.entities.concretes.Experience;

public interface ExperienceDao extends JpaRepository<Experience, Integer> {
	public List<Experience> getByResume_Id(int id);
	public List<Experience> getByResume_Id(int id,Sort sort);
}
