package com.rgsoft.hrms.business.abstracts;

import java.util.List;

import com.rgsoft.hrms.core.utilities.results.DataResult;
import com.rgsoft.hrms.core.utilities.results.Result;
import com.rgsoft.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	public DataResult<List<JobPosition>> findAll();
	public Result add(JobPosition jobPosition);
}
