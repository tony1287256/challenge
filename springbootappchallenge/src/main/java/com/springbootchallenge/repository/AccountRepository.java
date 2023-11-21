package com.springbootchallenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootchallenge.model.Account;

public interface AccountRepository extends JpaRepository<Account,Integer>{

}
