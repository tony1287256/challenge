package com.springboot.ecommerceapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.ecommerceapp.model.ProductCustomer;

public interface ProductCustomerRepository extends JpaRepository<ProductCustomer,Integer> {

}
