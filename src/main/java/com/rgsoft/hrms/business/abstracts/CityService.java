package com.rgsoft.hrms.business.abstracts;

import java.util.List;

import com.rgsoft.hrms.entities.concretes.City;

public interface CityService {
	public List<City> findAll();
}
