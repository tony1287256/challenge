package com.springboot.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.main.model.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback,Integer>{

}
