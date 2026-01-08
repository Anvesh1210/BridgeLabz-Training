package com.sortingalgorithms;

public class CountingSort{
	//method to perform counting sort algo
    public static void countingSort(int[] ages) {
        int minAge = 10;
        int maxAge = 18;
        int range = maxAge - minAge + 1;
        int[] count = new int[range];
        int[] output = new int[ages.length];

        //count frequency
        for (int age : ages) {
            count[age - minAge]++;
        }
        //cumulative count
        for (int i = 1; i < range; i++) {
            count[i] = count[i] + count[i - 1];
        }
        //place elements in correct position
        for (int i = ages.length - 1; i >= 0; i--) {
            output[count[ages[i] - minAge] - 1] = ages[i];
            count[ages[i] - minAge]--;
        }
        //copy to original array
        for (int i = 0; i < ages.length; i++) {
            ages[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int[] studentAges = {12, 15, 11, 18, 14, 10, 13};
        //before sorting
        for (int age : studentAges) {
            System.out.print(age + " ");
        }
        countingSort(studentAges);
        System.out.println();
        //after sorting
        for (int age : studentAges) {
            System.out.print(age + " ");
        }
    }
}

