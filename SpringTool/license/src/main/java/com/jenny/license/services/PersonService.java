package com.jenny.license.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.jenny.license.models.Person;
import com.jenny.license.repositories.PersonRepository;

@Service
public class PersonService {
	private PersonRepository personRepository;
	
	public PersonService(PersonRepository personRepository){
		this.personRepository = personRepository;
	}
	
	public void create(Person person){
		personRepository.save(person);
	}
	
	public Person getId(Long id){
		return personRepository.findOne(id);
	}
	
	
	public ArrayList<Person> all(){
		return (ArrayList<Person>) personRepository.findAll();
	}

	public Person findById(Long id) {		
		return personRepository.findOne(id) ;
	}


}
