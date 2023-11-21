package com.springbootchallenge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootchallenge.model.Account;
import com.springbootchallenge.model.AccountHolder;
import com.springbootchallenge.repository.AccountHolderRepository;
import com.springbootchallenge.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;
	
	public void saveAccount(Account account) {
		accountRepository.save(account);
	
	}

}
