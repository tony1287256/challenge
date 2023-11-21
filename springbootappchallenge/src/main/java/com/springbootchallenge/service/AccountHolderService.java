package com.springbootchallenge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootchallenge.model.AccountHolder;
import com.springbootchallenge.repository.AccountHolderRepository;

@Service
public class AccountHolderService {

	
	@Autowired
	private AccountHolderRepository accountHolderRepository;
	
	public void saveAccountHolder(AccountHolder accountHolder) {
		accountHolderRepository.save(accountHolder);
	
		
	}

	
	}


