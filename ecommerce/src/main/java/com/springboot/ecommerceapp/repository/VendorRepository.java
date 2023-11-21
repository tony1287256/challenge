package com.springboot.ecommerceapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.ecommerceapp.model.Vendor;

public interface VendorRepository extends JpaRepository<Vendor,Integer> {

}
