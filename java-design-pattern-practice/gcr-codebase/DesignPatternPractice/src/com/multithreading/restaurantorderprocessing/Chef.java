package com.multithreading.restaurantorderprocessing;

public class Chef extends Thread {
	private String dish;
	private int time;

	Chef(String name, String dish, int time) {
		setName(name);
		this.dish = dish;
		this.time = time;
	}

	@Override
	public void run() {
		System.out.println(getName() + " started preparing " + dish);
		int[] progress = { 25, 50, 75, 100 };

		for (int p : progress) {
			try {
				Thread.sleep(time / 4);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(getName() + " preparing " + dish + ": " + p + "% complete");
		}
	}
}
