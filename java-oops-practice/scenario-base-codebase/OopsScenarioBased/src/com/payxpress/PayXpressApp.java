package com.payxpress;

import java.time.*;

//main class for execution
public class PayXpressApp {

	// method for main execution
	public static void main(String[] args) {

		Bill e = new ElectricityBill(1200, LocalDate.of(2026, 1, 25));
		Bill i = new InternetBill(800, LocalDate.of(2026, 1, 22));
		Bill w = new WaterBill(500, LocalDate.of(2026, 1, 28));

		e.sendReminder();
		i.sendReminder();
		w.sendReminder();

		e.pay(50);
		i.pay(100);
		w.pay(20);
	}
}
