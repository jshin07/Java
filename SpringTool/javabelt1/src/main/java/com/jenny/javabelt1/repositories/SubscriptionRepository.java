package com.jenny.javabelt1.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jenny.javabelt1.models.Subscription;

@Repository
public interface SubscriptionRepository extends CrudRepository <Subscription, Long>{
	public List<Subscription> findAll();
	public Subscription findById(Long id);
}
