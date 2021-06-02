package com.rgsoft.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rgsoft.hrms.entities.concretes.City;

public interface CityDao extends JpaRepository<City, Integer> {

}
