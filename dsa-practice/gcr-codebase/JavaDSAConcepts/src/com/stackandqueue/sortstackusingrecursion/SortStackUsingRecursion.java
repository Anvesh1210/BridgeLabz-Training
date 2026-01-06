package com.stackandqueue.sortstackusingrecursion;
import java.util.Stack;

//class to sort a stack using recursion
public class SortStackUsingRecursion {
	 //function to sort the stack
    public void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        //removing top element
        int top = stack.pop();
        //sort remaining stack
        sortStack(stack);
        //insert element in sorted order
        insertSorted(stack, top);
    }

    //method to insert element in sorted stack
    private void insertSorted(Stack<Integer> stack, int element) {
        // Base case
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }

        //remove top element
        int top = stack.pop();
        insertSorted(stack, element);
        //push back the removed element
        stack.push(top);
    }

    
}
