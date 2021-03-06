package com.jenny.javareviewer.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jenny.javareviewer.models.Role;


@Repository
public interface RoleRepository extends CrudRepository <Role, Long> {
	public List<Role> findAll();
	public Role findByName(String name);
}
