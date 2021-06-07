package com.rgsoft.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rgsoft.hrms.business.abstracts.CityService;
import com.rgsoft.hrms.core.utilities.results.DataResult;
import com.rgsoft.hrms.entities.concretes.City;

@RestController
@RequestMapping("/api/cities")
public class CityController {
		
	private CityService cityService;

	@Autowired
	public CityController(CityService cityService) {
		super();
		this.cityService = cityService;
	}
	
	@GetMapping("getAll")
	public DataResult<List<City>> getAll(){
		return this.cityService.findAll();
	}
	
}
