package com.rgsoft.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgsoft.hrms.business.abstracts.ResumeService;
import com.rgsoft.hrms.core.utilities.results.DataResult;
import com.rgsoft.hrms.core.utilities.results.Result;
import com.rgsoft.hrms.core.utilities.results.SuccessDataResult;
import com.rgsoft.hrms.core.utilities.results.SuccessResult;
import com.rgsoft.hrms.dataAccess.abstracts.ResumeDao;
import com.rgsoft.hrms.dataAccess.abstracts.SkillDao;
import com.rgsoft.hrms.entities.concretes.Resume;
import com.rgsoft.hrms.entities.concretes.Skill;


@Service
public class ResumeManager implements ResumeService{

	ResumeDao resumeDao;
	SkillDao skillDao;
	
	@Autowired
	public ResumeManager(ResumeDao resumeDao) {
		super();
		this.resumeDao = resumeDao;
	}

	@Override
	public DataResult<List<Resume>> findAll() {
		List<Resume> result = this.resumeDao.findAll();
		return new SuccessDataResult<List<Resume>>(result,"Bilgiler getirildi..");
	}
	
	@Override
	public DataResult<Resume> findById(int id){
		Resume result = this.resumeDao.findById(id);
		return new SuccessDataResult<Resume>(result, "Bilgi getirildi.");
	}

	@Override
	public Result save(Resume resume) {
		this.resumeDao.save(resume);
		return new SuccessResult("CV sisteme eklendi");
	}

	@Override
	public Result addSkillToResume(int skillId, int resumeId) {
		Resume resume = this.resumeDao.findById(resumeId);
		Skill skill = new Skill();
		skill.setId(skillId);
		resume.getHavingSkills().add(skill);
		this.resumeDao.save(resume);
		return new SuccessResult("Yetenek başarı ile eklendi.");
	}

	@Override
	public DataResult<Resume> findByJobSeekerId(int id) {
		Resume resume = this.resumeDao.findByJobSeeker_Id(id);
		return new SuccessDataResult<Resume>(resume);
	}

}
