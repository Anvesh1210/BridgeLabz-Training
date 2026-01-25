package com.sorting.foodfest;

public class FoodFest {
    //method for start merge sort
    public void mergeSort(Stall[] stalls) {
        if (stalls.length < 2) {
            return;
        }
        int mid = stalls.length / 2;
        Stall[] left = new Stall[mid];
        Stall[] right = new Stall[stalls.length - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = stalls[i];
        }
        for (int i = mid; i < stalls.length; i++) {
            right[i - mid] = stalls[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(stalls, left, right);
    }
    //method for merging
    private void merge(Stall[] result, Stall[] left, Stall[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i].getFootfall() <= right[j].getFootfall()) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        while (i < left.length) {
            result[k++] = left[i++];
        }
        while (j < right.length) {
            result[k++] = right[j++];
        }
    }

    //method for displaying stall list
    public void displayStalls(Stall[] stalls) {
        for (Stall s : stalls) {
            s.display();
        }
    }
}
