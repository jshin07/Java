package com.jenny.javareviewer.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jenny.javareviewer.models.User;

@Repository
public interface UserRepository extends CrudRepository <User, Long>{
	public User findByEmail(String email);
	public User findById(Long id);
	public List<User> findAll();
	}
