package com.springboot.main.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String code;
	private LocalDateTime departure_time;
	private LocalDateTime arrival_time;
	private int avaliable_seats;
	private double price;
	
	@ManyToOne
	private Route route;
	@ManyToOne
	private Airline airline;
	public Route getRoute() {
		return route;
	}
	public void setRoute(Route route) {
		this.route = route;
	}
	public Airline getAirline() {
		return airline;
	}
	public void setAirline(Airline airline) {
		this.airline = airline;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public LocalDateTime getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(LocalDateTime departure_time) {
		this.departure_time = departure_time;
	}
	public LocalDateTime getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(LocalDateTime arrival_time) {
		this.arrival_time = arrival_time;
	}
	public int getAvaliable_seats() {
		return avaliable_seats;
	}
	public void setAvaliable_seats(int avaliable_seats) {
		this.avaliable_seats = avaliable_seats;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Flight [id=" + id + ", code=" + code + ", departure_time=" + departure_time + ", arrival_time="
				+ arrival_time + ", avaliable_seats=" + avaliable_seats + ", price=" + price + ", route=" + route
				+ ", airline=" + airline + "]";
	}
	
	
	
	
	
}
