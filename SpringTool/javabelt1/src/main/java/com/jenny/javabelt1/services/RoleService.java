package com.jenny.javabelt1.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jenny.javabelt1.models.Role;
import com.jenny.javabelt1.repositories.RoleRepository;


@Service
public class RoleService {
	private RoleRepository roleRepository;
	
	public RoleService(RoleRepository roleRepository){
		this.roleRepository= roleRepository;
	}
	
	public List<Role> all(){
		return roleRepository.findAll();
	}
	
	public void create(Role role){
		roleRepository.save(role);
	}
	
	public void update(Role role){
		roleRepository.save(role);
	}
	
	public void destroy(Role role){
		roleRepository.delete(role);
	}
	
	public Role findByName(String name){
		return roleRepository.findByName(name);
	}
}
