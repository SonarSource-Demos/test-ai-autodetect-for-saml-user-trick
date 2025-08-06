package org.example;

public class CountingSort {

    // Sorts the array in ascending order using counting sort
    public static void countingSort(int[] arr) {
        if (arr == null) throw new IllegalArgumentException("Array must not be null");
        if (arr.length == 0) return;

        int max = arr[0];
        for (int num : arr) {
            if (num < 0) throw new IllegalArgumentException("Array must not contain negative numbers");
            if (num > max) max = num;
        }

        int[] count = new int[max + 1];
        for (int num : arr) {
            count[num]++;
        }

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) {
                arr[index++] = i;
            }
        }
    }
}