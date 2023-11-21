package com.springboot.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.main.model.Feedback;
import com.springboot.main.repository.FeedbackRepository;

@Service
public class FeedbackService {

	@Autowired
	private FeedbackRepository feedbackRepository;
	public Feedback insert(Feedback feedback) {
		return feedbackRepository.save(feedback);
	}
	public Feedback getById(int pid) {
		// TODO Auto-generated method stub
		return null;
	}
}
