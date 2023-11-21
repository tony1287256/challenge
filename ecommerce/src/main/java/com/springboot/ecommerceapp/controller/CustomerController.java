package com.springboot.ecommerceapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.ecommerceapp.model.Address;
import com.springboot.ecommerceapp.model.Customer;
import com.springboot.ecommerceapp.service.AddressService;
import com.springboot.ecommerceapp.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private AddressService addressService;
	
	/* 
	 * @Param 
	 * {
    "name":"",
    "contact":"",
    "email":"",
    "address":{
        "hno":"",
        "street":"",
        "city":"",
        "pinCode":"",
        "state":""
    }
}
	 * */
	@PostMapping("/customer/address/add")
	public Customer postCustomer(@RequestBody Customer customer) {
		/* Step 1: save address : address with id */
		Address address = addressService.postAddress(customer.getAdress());
		/* Step 2: attach saved address(with id) to customer */
		customer.setAdress(address);
		/* Step 3: save customer */
		customer = customerService.postCustomer(customer);
		return customer; 
	}
}