package com.jenny.javareviewer.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jenny.javareviewer.models.Guild;
import com.jenny.javareviewer.repositories.GuildRepository;

@Service
public class GuildService {
	private GuildRepository guildRepository;
	
	public GuildService(GuildRepository guildRepository){
		this.guildRepository = guildRepository;		
	}
	
	public List<Guild> all(){
		return guildRepository.findAll();
	}
	
	public void create(Guild guild){
		guildRepository.save(guild);
	}
	
	public void update(Guild guild){
		guildRepository.save(guild);
	}
	
	public void destroy(Long id){
		guildRepository.delete(id);
	}
	
	public Guild findById(Long id){
		return guildRepository.findById(id);
	}
	
}
