package com.springbootchallenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootchallenge.model.AccountHolder;

public interface AccountHolderRepository extends JpaRepository<AccountHolder,Integer>{

}
