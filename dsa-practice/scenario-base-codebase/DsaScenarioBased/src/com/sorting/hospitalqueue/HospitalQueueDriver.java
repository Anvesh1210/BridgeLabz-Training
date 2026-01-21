package com.sorting.hospitalqueue;

public class HospitalQueueDriver {
	public static void main(String[] args) {

		HospitalQueue queue = new HospitalQueue();

		queue.add(new Patient("Rahul", 4));
		queue.add(new Patient("Anita", 9));
		queue.add(new Patient("Vikas", 6));
		queue.add(new Patient("Sneha", 10));
		queue.add(new Patient("Aman", 3));

		queue.assignBed();
	}
}
