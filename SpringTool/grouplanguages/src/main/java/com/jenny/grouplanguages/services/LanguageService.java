package com.jenny.grouplanguages.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.jenny.grouplanguages.models.Language;

@Service
public class LanguageService {
	private ArrayList<Language> languages = new ArrayList<>();
	
	public ArrayList<Language> all(){
		return languages;
	}
	
	public Language getByIndex(int id){
		if(id>=0 && id<languages.size()){
			return languages.get(id);
		} else {
			return null;
		}
	}
	
	public void create(Language language){
		languages.add(language);
		
	}
	
	public void delete(int id){
		if(id>=0 && id<languages.size()){
			languages.remove(id);
		} 
	}
	
	public void update(int id, Language language){
		if(id>=0 && id<languages.size()){
			languages.set(id, language);
		} 
	}
	
	
    public Language findLanguage(int index) {
        if (index < languages.size()){
            return languages.get(index);
        }else{
            return null;
        }
    }
    
    
	
	
	}
	
