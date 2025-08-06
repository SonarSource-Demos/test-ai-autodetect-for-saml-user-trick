package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingSortTest {

    @Test
    void testCountingSort() {
        int[] arr = {5, 3, 8, 6, 2};
        CountingSort.countingSort(arr);
        assertArrayEquals(new int[]{2, 3, 5, 6, 8}, arr);
    }

    @Test
    void testCountingSortEmptyArray() {
        int[] arr = {};
        CountingSort.countingSort(arr);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    void testCountingSortSingleElement() {
        int[] arr = {1};
        CountingSort.countingSort(arr);
        assertArrayEquals(new int[]{1}, arr);
    }

    @Test
    void testCountingSortAlreadySorted() {
        int[] arr = {1, 2, 3, 4, 5};
        CountingSort.countingSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testCountingSortWithDuplicates() {
        int[] arr = {4, 2, 4, 3, 2};
        CountingSort.countingSort(arr);
        assertArrayEquals(new int[]{2, 2, 3, 4, 4}, arr);
    }

    @Test
    void testCountingSortNullArray() {
        assertThrows(IllegalArgumentException.class, () -> CountingSort.countingSort(null));
    }

    @Test
    void testCountingSortNegativeNumbers() {
        int[] arr = {3, -1, 2};
        assertThrows(IllegalArgumentException.class, () -> CountingSort.countingSort(arr));
    }
}