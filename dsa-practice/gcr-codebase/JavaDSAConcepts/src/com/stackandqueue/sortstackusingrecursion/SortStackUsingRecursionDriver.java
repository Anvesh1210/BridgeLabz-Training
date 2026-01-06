package com.stackandqueue.sortstackusingrecursion;
import java.util.Stack;

//class to make stack and sort it 
public class SortStackUsingRecursionDriver {
	public static void main(String[] args) {
		//creating a stack
        Stack<Integer> stack = new Stack<>();
        SortStackUsingRecursion s = new SortStackUsingRecursion();
        stack.push(30);
        stack.push(10);
        stack.push(50);
        stack.push(20);
        System.out.println("Original Stack: " + stack);
        //calling sortStack function to sort the stack
        s.sortStack(stack);

        System.out.println("Sorted Stack: " + stack);
    }
}
