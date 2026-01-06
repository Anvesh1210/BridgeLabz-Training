package com.stackandqueue.slidingwindowmaximum;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {
	public static int[] maxSlidingWindow(int[] arr, int k) {
	    int n = arr.length;
	    if (n == 0 || k == 0) {
	        return new int[0];
	    }
	    int[] result = new int[n - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            //remove elements outside the window
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }
            //remove smaller elements 
            while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
                deque.pollLast();
            }
            //add current index
            deque.offerLast(i);
            //store max when window is fully formed
            if (i >= k - 1) {
                result[i - k + 1] = arr[deque.peekFirst()];
            }
        }
        return result;
    }
}
