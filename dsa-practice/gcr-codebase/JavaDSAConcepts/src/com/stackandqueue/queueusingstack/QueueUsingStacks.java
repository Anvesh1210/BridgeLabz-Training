package com.stackandqueue.queueusingstack;

import java.util.Stack;

public class QueueUsingStacks {
	private Stack<Integer> stackEnq;
    private Stack<Integer> stackDeq;

    public QueueUsingStacks() {
        stackEnq = new Stack<>();
        stackDeq = new Stack<>();
    }

    // Enqueue operation
    public void enqueue(int data) {
        stackEnq.push(data);
        System.out.println("Enqueued: " + data);
    }

    // Dequeue operation
    public int dequeue() {
        if (stackDeq.isEmpty()) {
            while (!stackEnq.isEmpty()) {
                stackDeq.push(stackEnq.pop());
            }
        }

        if (stackDeq.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return stackDeq.pop();
    }

    // Display front element
    public int peek() {
        if (stackDeq.isEmpty()) {
            while (!stackEnq.isEmpty()) {
                stackDeq.push(stackEnq.pop());
            }
        }

        if (stackDeq.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return stackDeq.peek();
    }
}
