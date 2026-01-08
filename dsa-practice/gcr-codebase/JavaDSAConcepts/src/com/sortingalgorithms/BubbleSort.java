package com.sortingalgorithms;

public class BubbleSort{
	//method to perform bubble sort algo
    public static void bubbleSort(int[] marks){
        int n = marks.length;
        boolean swapped;
        //loop for passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            //compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    // swap
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }
            //stop if no swapping
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] studentMarks = {78, 45, 89, 62, 55, 91};
        //before sorting
        for (int mark : studentMarks) {
            System.out.print(mark + " ");
        }
        bubbleSort(studentMarks);
        System.out.println();
        //after sorting
        for (int mark : studentMarks) {
            System.out.print(mark + " ");
        }
    }
}

