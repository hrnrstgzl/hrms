package com.rgsoft.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgsoft.hrms.business.abstracts.LanguageService;
import com.rgsoft.hrms.core.utilities.results.DataResult;
import com.rgsoft.hrms.core.utilities.results.Result;
import com.rgsoft.hrms.core.utilities.results.SuccessDataResult;
import com.rgsoft.hrms.core.utilities.results.SuccessResult;
import com.rgsoft.hrms.dataAccess.abstracts.LanguageDao;
import com.rgsoft.hrms.entities.concretes.Language;
@Service
public class LanguageManager implements LanguageService {

	private LanguageDao languageDao;
	
	
	@Autowired
	public LanguageManager(LanguageDao languageDao) {
		super();
		this.languageDao = languageDao;
	}

	@Override
	public DataResult<List<Language>> getAll() {
		List<Language> result = this.languageDao.findAll();
		return new SuccessDataResult<List<Language>>(result,"Veriler Listelendi");
	}

	@Override
	public DataResult<Language> getById(int id) {
		Language result = this.languageDao.findById(null).get();
		return new SuccessDataResult<Language>(result,"Veri çekme başarılı");
	}

	@Override
	public Result add(Language language) {
		this.languageDao.save(language);
		return new SuccessResult("Kayıt Başarılı");
	}

}
