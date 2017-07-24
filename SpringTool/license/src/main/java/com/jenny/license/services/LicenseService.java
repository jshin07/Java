package com.jenny.license.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.jenny.license.models.License;
import com.jenny.license.repositories.LicenseRepository;

@Service
public class LicenseService {
	private LicenseRepository licenseRepository;
	
	public LicenseService(LicenseRepository licenseRepository){
		this.licenseRepository = licenseRepository;
	}
	
	public void create(License license){
		licenseRepository.save(license);
	}
	
	public ArrayList<License> all(){
		return (ArrayList<License>) licenseRepository.findAll();
	}

	public License findById(long id) {
		return licenseRepository.findOne(id);
	}
}
