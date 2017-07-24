package com.jenny.productscatagories.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jenny.productscatagories.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

}
