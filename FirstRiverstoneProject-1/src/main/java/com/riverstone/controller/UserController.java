package com.riverstone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.riverstone.model.hibernatemapping.Categories;
import com.riverstone.model.hibernatemapping.Products;
import com.riverstone.service.ProductService;

@RestController
public class UserController {

	@Autowired
	private ProductService service;
	
	@Autowired
	private Categories categories;

	@PostMapping("/updateProduct")
	public Object postProductData(@RequestBody Products products) {
		return service.updateProduct(products);
	}
	
	//
	@PostMapping("/./jsp/userDetail.jsp")
	public Object postcategoryData(@RequestBody Categories category) {
		return categories.getCategoryName();
		
	}
}
