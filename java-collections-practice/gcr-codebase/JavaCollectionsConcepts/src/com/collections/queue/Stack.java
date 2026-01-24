package com.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

//implement a stack using queue
public class Stack {
	
	// creating two queue
	Queue<Integer> queue;
	Queue<Integer> helpingQueue;
	
	//initializing queue
	public Stack() {
		queue = new LinkedList<>();
		helpingQueue = new LinkedList<>();
	}
	
	//method to push in the queue
	public void push(int number) {
		queue.add(number);
	}
	
	//method to pop from queue
	public int pop() {
		int size = queue.size();
		for (int i = 0; i < size - 1; i++) {
		    helpingQueue.add(queue.remove());
		}
		int x = queue.remove();
		Queue<Integer> temp = helpingQueue;
		helpingQueue = queue;
		queue = temp;
		return x;
	}
	
	//method to get top element from queue
	public int top() {
		int size = queue.size();
		for (int i = 0; i < size - 1; i++) {
		    helpingQueue.add(queue.remove());
		}
		int x = queue.remove();
		helpingQueue.add(x);
		Queue<Integer> temp = helpingQueue;
		helpingQueue = queue;
		queue = temp;
		return x;
	}
	public static void main(String[] args) {
		//creating Stack Object
		Stack stack = new Stack();
		
		//pushing element in Stack
		stack.push(1);
		stack.push(5);
		stack.push(4);
		stack.push(8);
		stack.push(9);
		stack.push(7);
		//pop element from stack
		System.out.println(stack.pop());
		//getting top element of Stack
		System.out.println(stack.top());
	}
}
