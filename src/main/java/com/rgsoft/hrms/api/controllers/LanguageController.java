package com.rgsoft.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rgsoft.hrms.business.abstracts.LanguageService;
import com.rgsoft.hrms.core.utilities.results.DataResult;
import com.rgsoft.hrms.core.utilities.results.Result;
import com.rgsoft.hrms.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages/")
public class LanguageController {
	
	private LanguageService languageService;
	
	@Autowired
	public LanguageController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	
	@GetMapping("getAll")
	public DataResult<List<Language>> getAll() {
		return this.languageService.getAll();
	}

	@GetMapping("getById")
	public DataResult<Language> getById(int id) {
		return this.languageService.getById(id);
	}
	
	@PostMapping("add")
	public Result add(Language language) {
		return this.languageService.add(language);
	}
	
}
