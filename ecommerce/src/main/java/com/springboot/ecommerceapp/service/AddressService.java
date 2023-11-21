package com.springboot.ecommerceapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.ecommerceapp.model.Address;
import com.springboot.ecommerceapp.repository.AddressRepository;

@Service
public class AddressService {

	@Autowired
	private AddressRepository addressRepository;
	
	public Address postAddress(Address address) {
		
		return addressRepository.save(address);
	}

}