package com.rgsoft.hrms.business.abstracts;

import java.util.List;

import com.rgsoft.hrms.core.utilities.results.DataResult;
import com.rgsoft.hrms.core.utilities.results.Result;
import com.rgsoft.hrms.entities.concretes.Skill;

public interface SkillService {
	public DataResult<List<Skill>> findAll();
	public Result save(Skill skill);
}
