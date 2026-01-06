package com.stackandqueue.stockspanproblem;

//driver class for StockSpan Class
public class StockSpanDriver {
	public static void main(String[] args) {

        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        StockSpan stockSpan = new StockSpan();
        int[] span = stockSpan.calculateSpan(prices);

        //printing stock prices
        System.out.println("Stock Prices:");
        for (int price : prices) {
            System.out.print(price + " ");
        }

        //printing spans
        System.out.println("\n\nStock Span:");
        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}
