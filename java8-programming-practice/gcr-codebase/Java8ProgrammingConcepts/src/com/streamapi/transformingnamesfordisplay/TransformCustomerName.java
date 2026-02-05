package com.streamapi.transformingnamesfordisplay;

import java.util.Arrays;
import java.util.List;

public class TransformCustomerName {
	public static void main(String[] args) {
		List<String> customers = Arrays.asList("anvesh", "rahul", "zoya", "amit");
		customers.stream().map(String::toUpperCase).sorted().forEach(System.out::println);
	}
}
