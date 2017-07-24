package com.jenny.auth.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jenny.auth.models.User;

@Repository
public interface UserRepository extends CrudRepository <User, Long>{
	User findByUsername(String username);
}
