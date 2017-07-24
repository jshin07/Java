package com.jenny.dojoninjas.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.jenny.dojoninjas.models.Ninja;
import com.jenny.dojoninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	private NinjaRepository ninjaRepository;
	
	public NinjaService(NinjaRepository ninjaRepository){
		this.ninjaRepository =ninjaRepository;
	}
	
	public void create(Ninja ninja){
		ninjaRepository.save(ninja);
	}
	
	public ArrayList<Ninja> all(){
		return (ArrayList<Ninja>) ninjaRepository.findAll();
	}
	
	public Ninja findById(long id){
		return ninjaRepository.findOne(id);
	}
	
}
