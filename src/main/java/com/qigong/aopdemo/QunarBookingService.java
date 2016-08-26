package com.qigong.aopdemo;

public class QunarBookingService implements BookingService {
	public boolean bookFlight() {
		System.out.println("book fight by Qunar!");
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return true;
	}
}
