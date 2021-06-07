package com.rgsoft.hrms.business.abstracts;

import java.util.List;

import com.rgsoft.hrms.core.utilities.results.DataResult;
import com.rgsoft.hrms.entities.concretes.City;

public interface CityService {
	public DataResult<List<City>> findAll();
}
