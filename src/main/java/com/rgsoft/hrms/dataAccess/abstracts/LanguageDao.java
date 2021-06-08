package com.rgsoft.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rgsoft.hrms.entities.concretes.Language;

public interface LanguageDao extends JpaRepository<Language, Integer>{
	
}
