package com.springbootchallenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootchallenge.model.AccountDetails;

public interface AccountDetailsRepository extends JpaRepository<AccountDetails,Integer>{

}
