package com.sortingalgorithms;

public class SelectionSort{
	//method to perform selection sort algo
    public static void selectionSort(int[] scores) {
        int n = scores.length;
        //loop for each position
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            //find minimum element
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }
            //swap with first unsorted element
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] examScores = {72, 88, 95, 63, 80};
        //before sorting
        for (int score : examScores) {
            System.out.print(score + " ");
        }
        selectionSort(examScores);
        System.out.println();
        //after sorting
        for (int score : examScores) {
            System.out.print(score + " ");
        }
    }
}

