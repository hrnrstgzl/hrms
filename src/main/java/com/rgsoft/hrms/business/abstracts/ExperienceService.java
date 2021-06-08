package com.rgsoft.hrms.business.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.rgsoft.hrms.core.utilities.results.DataResult;
import com.rgsoft.hrms.core.utilities.results.Result;
import com.rgsoft.hrms.entities.concretes.Experience;

public interface ExperienceService {
	public DataResult<List<Experience>> getAll();
	public Result add(Experience experience);
	public DataResult<List<Experience>> getByResume_Id(int id);
	public DataResult<List<Experience>> getByResume_IdSorted(int id,Sort sort);
}
