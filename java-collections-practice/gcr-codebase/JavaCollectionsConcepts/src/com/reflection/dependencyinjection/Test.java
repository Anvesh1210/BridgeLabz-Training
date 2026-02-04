package com.reflection.dependencyinjection;

public class Test {
	public static void main(String[] args) throws Exception {
		Car car = DIContainer.create(Car.class);
		car.drive();
	}
}
