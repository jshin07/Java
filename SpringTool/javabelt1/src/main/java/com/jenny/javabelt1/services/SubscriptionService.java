package com.jenny.javabelt1.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jenny.javabelt1.models.Subscription;
import com.jenny.javabelt1.repositories.SubscriptionRepository;

@Service
public class SubscriptionService {
	private SubscriptionRepository subscriptionRepository;
	
	public SubscriptionService(SubscriptionRepository subscriptionRepository){
		this.subscriptionRepository = subscriptionRepository;
	}
	
	public void create(Subscription subscription){
		subscriptionRepository.save(subscription);
	}
	
	public void update(Subscription subscription){
		subscriptionRepository.save(subscription);
	}
	
	public void destroy(Subscription subscription){
		subscriptionRepository.delete(subscription);
	}
	
	public Subscription findById(Long id){
		return subscriptionRepository.findById(id);
	}
	
	public List<Subscription> all(){
		return subscriptionRepository.findAll();
	}
	
}
