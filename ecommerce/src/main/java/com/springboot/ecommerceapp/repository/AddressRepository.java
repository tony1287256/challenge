package com.springboot.ecommerceapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.ecommerceapp.model.Address;
import com.sun.xml.bind.v2.model.core.ID;

public interface AddressRepository extends JpaRepository<Address,Integer>{

}
