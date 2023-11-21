package com.springbootchallenge.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootchallenge.model.User;

public interface UserRepository extends JpaRepository<User,Integer>{

}
