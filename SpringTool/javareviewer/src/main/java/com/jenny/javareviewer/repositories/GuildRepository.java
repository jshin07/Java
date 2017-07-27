package com.jenny.javareviewer.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jenny.javareviewer.models.Guild;

@Repository
public interface GuildRepository extends CrudRepository <Guild, Long>{
	public List<Guild> findAll();
	public Guild findById(Long id);
}
