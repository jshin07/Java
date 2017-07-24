package com.jenny.dojoninjas.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.jenny.dojoninjas.models.Dojo;
import com.jenny.dojoninjas.repositories.DojoRepository;

@Service
public class DojoService {
	private DojoRepository dojoRepository;
	
	public DojoService(DojoRepository dojoRepository){
		this.dojoRepository = dojoRepository;
	}
	
	public void create(Dojo dojo){
		dojoRepository.save(dojo);
	}
	
	public ArrayList<Dojo> all(){
		return(ArrayList<Dojo>) dojoRepository.findAll();
	}
	
	public Dojo findById(long id){
		return dojoRepository.findOne(id);
	}
	
}
