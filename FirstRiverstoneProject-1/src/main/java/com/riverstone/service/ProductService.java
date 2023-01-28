package com.riverstone.service;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.riverstone.jparepository.ProductRepository;
import com.riverstone.model.hibernatemapping.Products;

@Service
@ComponentScan
public class ProductService {

	
	private ProductRepository productRepository;
	
	public Products saveProduct(Products product) {
		return productRepository.save(product);
	}
	
	@Transactional
	public List<Products> getProducts() {
        return productRepository.findAll();
    }

    public Products updateProduct(Products product) {
        Products existingProduct = productRepository.findById(product.getProductID()).orElse(null);
        existingProduct.setCategoryID(product.getCategoryID());
        existingProduct.setProductName(product.getProductName());
        existingProduct.setPrice(product.getPrice());
        return productRepository.save(existingProduct);
    }
}
