package com.jenny.productscatagories.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jenny.productscatagories.models.Category;

@Repository
public interface CategoryRepository extends CrudRepository <Category, Long> {

}
