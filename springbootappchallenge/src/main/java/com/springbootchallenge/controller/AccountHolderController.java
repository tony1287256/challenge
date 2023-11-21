package com.springbootchallenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootchallenge.model.AccountHolder;
import com.springbootchallenge.service.AccountHolderService;
@RestController
@RequestMapping("accountHolder")
public class AccountHolderController {

	@Autowired
	private AccountHolderService accountHolderService;
	
	@PostMapping("/add")
	public ResponseEntity<?>addAccountHolder(@RequestBody AccountHolder accountHolder){
		
		accountHolderService.saveAccountHolder(accountHolder);
		return ResponseEntity.ok("successfully account holder saved");
	}
	
}
