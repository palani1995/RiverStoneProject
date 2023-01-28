package com.riverstone.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.riverstone.model.hibernatemapping.Products;

public interface ProductRepository extends JpaRepository<Products, String> {
	
	//quering method
	Products findByName(String name);
	
}
