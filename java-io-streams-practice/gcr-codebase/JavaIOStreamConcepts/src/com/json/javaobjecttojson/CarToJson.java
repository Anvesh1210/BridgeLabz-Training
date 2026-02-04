package com.json.javaobjecttojson;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CarToJson {
	public static void main(String[] args) throws Exception {
		Car car = new Car();
		car.brand = "Tesla";
		car.year = 2024;
		car.price = 50000;
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(mapper.writeValueAsString(car));
	}
}
