package com.collections.queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//reversing a queue by using queue operation
public class ReverseQueue {
	public static void main(String[] args) {
		//creating a queue 
		Queue<Integer> queue = new LinkedList<>(Arrays.asList(10, 20, 30));
		//creating stack
		Stack<Integer> stack = new Stack<>();
		
		//reversing queue
		while(!queue.isEmpty()) {
			stack.push(queue.remove());
		}
		while(!stack.isEmpty()) {
			queue.add(stack.pop());
		}
		
		//printing the revered queue
		System.out.println("Reversed Queue: "+queue);
	}
}
