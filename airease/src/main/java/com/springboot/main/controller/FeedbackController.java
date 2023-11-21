package com.springboot.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.main.model.Feedback;
import com.springboot.main.model.Passenger;
import com.springboot.main.model.PassengerFlight;
import com.springboot.main.service.FeedbackService;
import com.springboot.main.service.PassengerFlightService;
import com.springboot.main.service.PassengerService;

@RestController
public class FeedbackController {
	
	@Autowired
	private FeedbackService feedbackService;
	
	@Autowired
	private PassengerFlightService passengerFlightService;
	
	@Autowired
	private PassengerService passengerService;
	
	@PostMapping("/feedback/add/{pid}/{fid}")
	public ResponseEntity<?> insert(@PathVariable("pid") int pid,
			   @PathVariable("fid") int fid,@RequestBody Feedback feedback){
		try {
			Passenger passenger =passengerService.getById(pid);
			
			
			PassengerFlight passengerFlight = passengerFlight.getById(fid);
			
			feedback.setPassenger(passenger);
			feedback.setPassengerFlight(passengerFlight);
			
			feedback = feedbackService.insert(feedback);
			return ResponseEntity.ok().body(Feedback());
			
		}
	}
	
	

}
