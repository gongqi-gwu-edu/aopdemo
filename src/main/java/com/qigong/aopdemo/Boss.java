package com.qigong.aopdemo;

public class Boss {
	
	private BookingService bookingService;
	
	public Boss() {
		this.bookingService = new QunarBookingService();
	}

	public BookingService getBookingService() {
		return bookingService;
	}

	public void setBookingService(BookingService bookingService) {
		this.bookingService = bookingService;
	}
	
	public void goSomewhere() {
		long start = System.currentTimeMillis();
		boolean status = bookingService.bookFlight();
		

		long duration = System.currentTimeMillis() - start;
		System.out.println(String.format("time for booking flight is %d seconds", duration));
		

		if (status) {
			System.out.println("booking flight succeeded!");
		} else {
			System.out.println("booking flight failed!");
		}
	}
}
