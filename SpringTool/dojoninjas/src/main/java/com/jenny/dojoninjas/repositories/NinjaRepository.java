package com.jenny.dojoninjas.repositories;

import org.springframework.data.repository.CrudRepository;

import com.jenny.dojoninjas.models.Ninja;


public interface NinjaRepository extends CrudRepository <Ninja, Long> {

}
