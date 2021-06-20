package com.rgsoft.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgsoft.hrms.business.abstracts.SkillService;
import com.rgsoft.hrms.core.utilities.results.DataResult;
import com.rgsoft.hrms.core.utilities.results.Result;
import com.rgsoft.hrms.core.utilities.results.SuccessDataResult;
import com.rgsoft.hrms.core.utilities.results.SuccessResult;
import com.rgsoft.hrms.dataAccess.abstracts.SkillDao;
import com.rgsoft.hrms.entities.concretes.Skill;

@Service
public class SkillManager implements SkillService {
	
	SkillDao skillDao;
	
	@Autowired
	public SkillManager(SkillDao skillDao) {
		this.skillDao = skillDao;
	}

	@Override
	public DataResult<List<Skill>>  findAll() {
		List<Skill> result = this.skillDao.findAll();
		return new SuccessDataResult<List<Skill>>(result,"Veriler Getirildi");
	}

	@Override
	public Result save(Skill skill){
		this.skillDao.save(skill);
		return new SuccessResult("Beceri başarı ile eklendi..");
	}

}
