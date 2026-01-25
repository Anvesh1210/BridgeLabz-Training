package com.sorting.medwarehouse;

public class MedWarehouseManager {

    //method for starting merge sort
    public void mergeSort(Medicine[] medicines) {
        if (medicines.length < 2) {
            return;
        }
        int mid = medicines.length / 2;
        Medicine[] left = new Medicine[mid];
        Medicine[] right = new Medicine[medicines.length - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = medicines[i];
        }
        for (int i = mid; i < medicines.length; i++) {
            right[i - mid] = medicines[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(medicines, left, right);
    }

    //method for merging two sorted medicine lists (stable)
    private void merge(Medicine[] result, Medicine[] left, Medicine[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i].getExpiryDays() <= right[j].getExpiryDays()) {
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

    //method for displaying medicine list
    public void displayMedicines(Medicine[] medicines) {
        for (Medicine m : medicines) {
        	System.out.println(m);
        }
    }
}
