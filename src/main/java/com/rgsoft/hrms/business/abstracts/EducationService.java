package com.rgsoft.hrms.business.abstracts;

import java.util.List;

import com.rgsoft.hrms.core.utilities.results.DataResult;
import com.rgsoft.hrms.core.utilities.results.Result;
import com.rgsoft.hrms.entities.concretes.Education;

public interface EducationService {
	public Result add(Education education);
	public DataResult<List<Education>> getAll();
	public DataResult<List<Education>> getByResume_Id(int id);
	public DataResult<List<Education>> getByResume_IdSorted(int id);
}
