package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void testBubbleSort() {
        int[] arr = {5, 3, 8, 6, 2};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(new int[]{2, 3, 5, 6, 8}, arr);
    }

    @Test
    void testBubbleSortEmptyArray() {
        int[] arr = {};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    void testBubbleSortSingleElement() {
        int[] arr = {1};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(new int[]{1}, arr);
    }

    @Test
    void testBubbleSortAlreadySorted() {
        int[] arr = {1, 2, 3, 4, 5};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testBubbleSortWithDuplicates() {
        int[] arr = {4, 2, 4, 3, 2};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(new int[]{2, 2, 3, 4, 4}, arr);
    }

    @Test
    void testBubbleSortNullArray() {
        assertThrows(IllegalArgumentException.class, () -> BubbleSort.bubbleSort(null));
    }
}