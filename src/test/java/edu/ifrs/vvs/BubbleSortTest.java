package edu.ifrs.vvs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    BubbleSort bubbleSort = new BubbleSort();

    @Test
    void testSortPositiveArray() {
        int[] testArray = { 6, 3, 7, 1, 9, 5 };
        int [] expectedArray = { 1, 3, 5, 6, 7, 9 };
        bubbleSort.sort(testArray);

        assertArrayEquals(testArray, expectedArray);
    }

    @Test
    void testSortNegativeArray() {
        int[] testArray = { -6, -3, -7, -1, -9, -5 };
        int [] expectedArray = { -9, -7, -6, -5, -3, -1 };
        bubbleSort.sort(testArray);

        assertArrayEquals(testArray, expectedArray);
    }

    @Test
    void testSortMixedArray() {
        int[] testArray = { 1, -5, 7, -4, -2, 10, 20, -32 };
        int [] expectedArray = { -32, -5, -4, -2, 1, 7, 10, 20 };
        bubbleSort.sort(testArray);

        assertArrayEquals(testArray, expectedArray);
    }

    @Test
    void testEmptyArray() {
        int[] testArray = {};
        int [] expectedArray = {};
        bubbleSort.sort(testArray);

        assertArrayEquals(testArray, expectedArray);
    }

    @Test
    void testNullArray() {
        int[] testArray = null;
        int [] expectedArray = null;
        bubbleSort.sort(testArray);

        assertArrayEquals(testArray, expectedArray);
    } 

}
