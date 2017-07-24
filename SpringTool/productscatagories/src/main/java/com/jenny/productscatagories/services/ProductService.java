package com.jenny.productscatagories.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.jenny.productscatagories.models.Product;
import com.jenny.productscatagories.repositories.ProductRepository;

@Service
public class ProductService {
	private ProductRepository productRepository;
	
	public ProductService(ProductRepository productRepository){
		this.productRepository = productRepository;
	}
	
	public void create(Product product){
		productRepository.save(product);
	}
	
	public ArrayList<Product> all(){
		return (ArrayList<Product>) productRepository.findAll();
	}
	
	public Product findById(long id){
		return productRepository.findOne(id);
	}
}
