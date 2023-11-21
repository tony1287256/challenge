package com.springboot.ecommerceapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.ecommerceapp.model.Customer;
import com.springboot.ecommerceapp.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public Customer postCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

}