package com.springboot.ecommerceapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.springboot.ecommerceapp.model.Product;
import com.springboot.ecommerceapp.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public Product postProduct(Product product) {
		return productRepository.save(product);
	}

	public List<Product> getAllProducts(Pageable pageable) {
		return productRepository.findAll(pageable).getContent() ;
	}

	public List<Product> getProductsByVendor(int vid) {
		/* 
		 * 1. Native Query 
		 * 2. JPQL 
		 * 3. JPA Instance methods 
		 * */
		return productRepository.getProductByVendorNative(vid);
	}

}