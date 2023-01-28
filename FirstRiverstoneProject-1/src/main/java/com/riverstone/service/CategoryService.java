package com.riverstone.service;

import org.springframework.stereotype.Service;

import com.riverstone.jparepository.CategoriesRepository;
import com.riverstone.model.hibernatemapping.Products;

@Service
public class CategoryService {

	private CategoriesRepository categoryRepository;

	public String updateProduct(Products product) {
		String categories = categoryRepository.findByName(product.getCategoryID()).getCategoryName();
		return categories;

	}

}
