package com.rgsoft.hrms.business.abstracts;

import java.util.List;

import com.rgsoft.hrms.core.utilities.results.DataResult;
import com.rgsoft.hrms.core.utilities.results.Result;
import com.rgsoft.hrms.entities.concretes.Language;

public interface LanguageService {
	public DataResult<List<Language>> getAll();
	DataResult<Language> getById(int id);
	public Result add(Language language);
}
