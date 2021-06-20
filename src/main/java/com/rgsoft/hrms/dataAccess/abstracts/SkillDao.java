package com.rgsoft.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rgsoft.hrms.entities.concretes.Skill;

public interface SkillDao extends JpaRepository<Skill, Integer>{
	
}
