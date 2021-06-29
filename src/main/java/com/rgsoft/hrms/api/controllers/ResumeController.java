package com.rgsoft.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rgsoft.hrms.business.abstracts.ResumeService;
import com.rgsoft.hrms.core.utilities.results.DataResult;
import com.rgsoft.hrms.core.utilities.results.Result;
import com.rgsoft.hrms.entities.concretes.Resume;

@RestController
@RequestMapping("/api/resume/")
public class ResumeController {

	ResumeService resumeService;

	@Autowired
	public ResumeController(ResumeService resumeService) {
		super();
		this.resumeService = resumeService;
	}
	
	 @GetMapping("/getAll")
	 public DataResult<List<Resume>> getAll(){
		 DataResult<List<Resume>> result = this.resumeService.findAll();
		 return result;
	 }
	 
	 @GetMapping("/getById")
	 public DataResult<Resume> getResumeById(int id){
		 DataResult<Resume> result = this.resumeService.findById(id);
		 return result;
	 }
	 
	 @GetMapping("/getByJobSeekerId")
	 public DataResult<Resume> getResumeByJobSeekerId(int id){
		 DataResult<Resume> result = this.resumeService.findByJobSeekerId(id);
		 return result;
	 }
	 	 
	 @PostMapping("/add")
	 public Result add(Resume resume) {
		 return this.resumeService.save(resume);
	 }
	
	 @PostMapping("/addSkillToResume")
	 public Result addSkillToResume(int skillId,int resumeId) {
		 return this.resumeService.addSkillToResume(skillId, resumeId);
	 }
	
	
}
