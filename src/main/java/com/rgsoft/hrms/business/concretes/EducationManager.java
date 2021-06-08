package com.rgsoft.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.rgsoft.hrms.business.abstracts.EducationService;
import com.rgsoft.hrms.core.utilities.results.DataResult;
import com.rgsoft.hrms.core.utilities.results.Result;
import com.rgsoft.hrms.core.utilities.results.SuccessDataResult;
import com.rgsoft.hrms.core.utilities.results.SuccessResult;
import com.rgsoft.hrms.dataAccess.abstracts.EducationDao;
import com.rgsoft.hrms.entities.concretes.Education;


@Service
public class EducationManager implements EducationService	{
	
	private EducationDao educationDao;
	
	@Autowired
	public EducationManager(EducationDao educationDao) {
		super();
		this.educationDao = educationDao;
	}

	@Override
	public Result add(Education education) {
		this.educationDao.save(education);
		return new SuccessResult("Kayıt Başarılı");
	}

	@Override
	public DataResult<List<Education>> getAll() {
		List<Education> result = this.educationDao.findAll();
		return new SuccessDataResult<List<Education>>(result,"Veriler başarı ile getirildi");
	}

	@Override
	public DataResult<List<Education>> getByResume_Id(int id) {
		List<Education> result = this.educationDao.getByResume_Id(id);
		return new SuccessDataResult<List<Education>>(result,"veriler başarı ile getirildi");
	}
	
	@Override
	public DataResult<List<Education>> getByResume_IdSorted(int id) {
		Sort sort = Sort.by(Sort.Direction.DESC,"graduateDate");
		List<Education> result = this.educationDao.getByResume_Id(id,sort);
		return new SuccessDataResult<List<Education>>(result,"veriler başarı ile getirildi");
	}
	
}
