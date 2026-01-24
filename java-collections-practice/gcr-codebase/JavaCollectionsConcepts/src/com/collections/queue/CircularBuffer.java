package com.collections.queue;

public class CircularBuffer {
	//creating queue using array
	private int[] buffer;
	private int size;
	private int front;
	private int rear;
	private int count;

	
	//Circular Buffer object
	public CircularBuffer(int size) {
		this.size = size;
		buffer = new int[size];
		front = 0;
		rear = 0;
		count = 0;
	}

	//creating insert function
	public void insert(int value) {
		buffer[rear] = value;
		rear = (rear + 1) % size;
		if (count == size) {
			front = (front + 1) % size;
		} else {
			count++;
		}
	}

	//creating display function
	public void display() {
		if (count == 0) {
			System.out.println("Buffer is empty");
			return;
		}
		System.out.print("Buffer:  ");
		for (int i = 0; i < count; i++) {
			System.out.print(buffer[(front + i) % size] + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		//creating circular Buffer object and performing operation
		CircularBuffer cb = new CircularBuffer(3);
		cb.insert(1);
		cb.insert(2);
		cb.insert(3);
		cb.display();
		cb.insert(4);
		cb.display();
	}
}
