package com.jenny.languagereloaded.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.jenny.languagereloaded.models.Language;
import com.jenny.languagereloaded.repositories.LanguageRepository;

@Service
public class LanguageServices {
	private LanguageRepository languageRepository;
	
	public LanguageServices(LanguageRepository languageRepository){
		this.languageRepository = languageRepository;
	}
	
	public ArrayList<Language> all(){
		return(ArrayList<Language>) languageRepository.findAll();
	}
	
	public double count(){
		return languageRepository.count();
	}
	
	public Language getByIndex(long id){
		return languageRepository.findOne(id);
	}
	
	public void create(Language language){
		languageRepository.save(language);
	}
	
	public void update(Language language){
		languageRepository.save(language);
	}
	
	public void destroy(long id){
		languageRepository.delete(id);
	}
	
	
}
