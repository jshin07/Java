package com.jenny.javareviewer.services;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jenny.javareviewer.models.Ring;
import com.jenny.javareviewer.repositories.RingRepository;

@Service
public class RingService {
	private RingRepository ringRepository;
	
	public RingService(RingRepository ringRepository){
		this.ringRepository = ringRepository;
	}
	
	public List<Ring> all(){
		return ringRepository.findAll();
	}
	
	public void create(Ring ring){
		ringRepository.save(ring);
	}
	
	public void update(Ring ring){
		ring.setUpdatedAt(new Date());
		ringRepository.save(ring);
	}
	
	public void destroy(Long id){
		ringRepository.delete(id);
	}
}
