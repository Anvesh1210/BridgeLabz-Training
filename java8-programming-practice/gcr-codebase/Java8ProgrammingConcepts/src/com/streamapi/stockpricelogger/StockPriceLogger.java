package com.streamapi.stockpricelogger;

import java.util.Arrays;
import java.util.List;

public class StockPriceLogger {
	public static void main(String[] args) {
		List<Double> stockPrices = Arrays.asList(1023.50, 1040.75, 1018.20);
		// Print stock prices
		stockPrices.forEach(price -> System.out.println("Stock Price: " + price));
	}
}
