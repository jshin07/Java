package com.jenny.license.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jenny.license.models.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

}
