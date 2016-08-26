package com.qigong.aopdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SmartBoss {
	private BookingService bookingService;

	@Autowired
	public void setBookingService(BookingService bookingService) {
		this.bookingService = bookingService;
	}
	
	public BookingService getBookingService() {
		return bookingService;
	}

	public void goSomewhere() {
		bookingService.bookFlight();
	}
}
