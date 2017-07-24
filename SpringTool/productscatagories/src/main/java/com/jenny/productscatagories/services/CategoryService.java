package com.jenny.productscatagories.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.jenny.productscatagories.models.Category;
import com.jenny.productscatagories.repositories.CategoryRepository;

@Service
public class CategoryService {
	private CategoryRepository categoryRepository;
	
	public CategoryService(CategoryRepository categoryRepository){
		this.categoryRepository =categoryRepository;
	}
	
	public void create(Category category){
		categoryRepository.save(category);
	}
	
	public ArrayList<Category> all(){
		return (ArrayList<Category>) categoryRepository.findAll();
	}
	
	public Category findById(long id){
		return categoryRepository.findOne(id);
	}
	
}
