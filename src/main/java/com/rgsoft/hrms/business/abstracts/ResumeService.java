package com.rgsoft.hrms.business.abstracts;

import java.util.List;

import com.rgsoft.hrms.core.utilities.results.DataResult;
import com.rgsoft.hrms.core.utilities.results.Result;
import com.rgsoft.hrms.entities.concretes.Resume;

public interface ResumeService {
	public DataResult<List<Resume>> findAll();
	public DataResult<Resume> findById(int id);
	public DataResult<Resume> findByJobSeekerId(int id);
	public Result save(Resume resume);
	public Result addSkillToResume(int skillId, int resumeId);
}
