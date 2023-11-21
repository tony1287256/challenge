package com.springbootchallenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootchallenge.model.BankExecutive;
import com.springbootchallenge.service.BankExecutiveService;

@RestController
@RequestMapping("/bank")
public class BankExecutiveController {

	@Autowired
	private BankExecutiveService bankExecutiveService;
	@PostMapping
	public ResponseEntity<?>addAccountDetails(@RequestBody BankExecutive bankExecutive){
		bankExecutiveService.saveBankExecutive(bankExecutive);
		return ResponseEntity.ok("successfully account holder saved");
	
		
	}
}
