package com.rgsoft.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.rgsoft.hrms.business.abstracts.ExperienceService;
import com.rgsoft.hrms.core.utilities.results.DataResult;
import com.rgsoft.hrms.core.utilities.results.Result;
import com.rgsoft.hrms.core.utilities.results.SuccessDataResult;
import com.rgsoft.hrms.core.utilities.results.SuccessResult;
import com.rgsoft.hrms.dataAccess.abstracts.ExperienceDao;
import com.rgsoft.hrms.entities.concretes.Experience;

@Service
public class ExperienceManager implements ExperienceService {

	private ExperienceDao experienceDao;
	
	@Autowired
	public ExperienceManager(ExperienceDao experienceDao) {
		super();
		this.experienceDao = experienceDao;
	}

	@Override
	public DataResult<List<Experience>> getAll() {
		List<Experience> result = this.experienceDao.findAll();
		return new SuccessDataResult<List<Experience>>(result,"Listeleme Başarılı");
	}

	@Override
	public Result add(Experience experience) {
		this.experienceDao.save(experience);
		return new SuccessResult("Kayıt Başarılı");
	}

	@Override
	public DataResult<List<Experience>> getByResume_Id(int id) {
		List<Experience> result = this.experienceDao.getByResume_Id(id);
		return new SuccessDataResult<List<Experience>>(result,"Listeleme Başarılı");
	}

	@Override
	public DataResult<List<Experience>> getByResume_IdSorted(int id, Sort sort) {
		List<Experience> result = this.experienceDao.getByResume_Id(id,sort);
		return new SuccessDataResult<List<Experience>>(result,"Listeleme başarılı");
	}

}
