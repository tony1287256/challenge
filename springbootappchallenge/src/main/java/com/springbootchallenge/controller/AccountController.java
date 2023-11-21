package com.springbootchallenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootchallenge.model.Account;
import com.springbootchallenge.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	@PostMapping("/add")
	public ResponseEntity<String>addAccount(@RequestBody Account account){
		
		accountService.saveAccount(account);
		return ResponseEntity.ok("successfully account holder saved");
	}
	
	

}
