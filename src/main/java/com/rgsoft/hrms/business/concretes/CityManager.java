package com.rgsoft.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgsoft.hrms.business.abstracts.CityService;
import com.rgsoft.hrms.dataAccess.abstracts.CityDao;
import com.rgsoft.hrms.entities.concretes.City;

@Service
public class CityManager implements CityService {
	
	private CityDao cityDao;

	@Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}

	@Override
	public List<City> findAll() {
		return this.cityDao.findAll();
	}
	
	
}
