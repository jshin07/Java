package com.jenny.admindashboard.services;

import java.util.Date;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.jenny.admindashboard.models.User;
import com.jenny.admindashboard.repositories.RoleRepository;
import com.jenny.admindashboard.repositories.UserRepository;

@Service
public class UserService {
	private UserRepository userRepository;
	private RoleRepository roleRepository;
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public UserService(UserRepository userRepository, RoleRepository roleRepository, BCryptPasswordEncoder bCryptPasswordEncoder){
		this.userRepository= userRepository;
		this.roleRepository=roleRepository;
		this.bCryptPasswordEncoder= bCryptPasswordEncoder;
	}
	
	public void saveWithUserRole(User user){
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setRoles(roleRepository.findByName("ROLE_USER"));
		userRepository.save(user);
	}
	
	public void saveWithAdminRole(User user){
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setRoles(roleRepository.findByName("ADMIN_USER"));
		userRepository.save(user);
	}
	
	public void update(User user){
		user.setUpdatedAt(new Date());
		userRepository.save(user);
	}
	public User findByEmail(String email){
		return userRepository.findByEmail(email);
	}
}
