package com.jenny.javareviewer.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jenny.javareviewer.models.Ring;

@Repository
public interface RingRepository extends CrudRepository <Ring, Long> {
	public List<Ring> findAll();
}
