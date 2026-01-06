package com.stackandqueue.stockspanproblem;
import java.util.Stack;

public class StockSpan {
	
	//method to calculate span
	public int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            //pop while current price is higher than stack top
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }
            //calculate span
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());
            //push current index
            stack.push(i);
        }
        //returning span
        return span;
    }
}
