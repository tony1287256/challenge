package com.springboot.ecommerceapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.ecommerceapp.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

	
	@Query(value = "select * from product where vendor_id=?1",nativeQuery = true)
	List<Product> getProductByVendorNative(int vid);
	}
