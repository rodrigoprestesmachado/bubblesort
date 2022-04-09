package edu.ifrs.vvs;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class BubbleSortUnitTest {

    private BubbleSort bubbleSort = new BubbleSort();

    @Test
    void testEmptyArray() {
        int[] outArray = {};
        int[] expectedArray = {};
        bubbleSort.sort(outArray);
        assertArrayEquals(expectedArray, outArray);
    }

    @Test
    void testArraySizeOne() {
        int[] outArray = { 1 };
        int[] expectedArray = { 1 };
        bubbleSort.sort(outArray);
        assertArrayEquals(expectedArray, outArray);
    }

    @Test
    void testArrayNegativeNumbers() {
        int[] outArray = { -1, -2 };
        int[] expectedArray = { -2, -1 };
        bubbleSort.sort(outArray);
        assertArrayEquals(expectedArray, outArray);
    }

    @Test
    void testArrayNegativeNumbersAndZero() {
        int[] outArray = { -1, -2, 0 };
        int[] expectedArray = { -2, -1, 0 };
        bubbleSort.sort(outArray);
        assertArrayEquals(expectedArray, outArray);
    }

    @Test
    void testArrayPositiveNumbers() {
        int[] outArray = { 3, 1 };
        int[] expectedArray = { 1, 3 };
        bubbleSort.sort(outArray);
        assertArrayEquals(expectedArray, outArray);
    }

    @Test
    void testArrayPositiveNumbersAndZero() {
        int[] outArray = { 1, 3, 0 };
        int[] expectedArray = { 0, 1, 3 };
        bubbleSort.sort(outArray);
        assertArrayEquals(expectedArray, outArray);
    }

    @Test
    void testArrayMixedNumbers() {
        int[] outArray = { 3, 1, -7, 0 };
        int[] expectedArray = { -7, 0, 1, 3 };
        bubbleSort.sort(outArray);
        assertArrayEquals(expectedArray, outArray);
    }

    @Test
    void testArrayRepeatingPositiveNumbers() {
        int[] outArray = { 3, 3, 2 };
        int[] expectedArray = { 2, 3, 3 };
        bubbleSort.sort(outArray);
        assertArrayEquals(expectedArray, outArray);
    }

    @Test
    void testArrayRepeatingNegativeNumbers() {
        int[] outArray = { -3, -3, 2 };
        int[] expectedArray = { -3, -3, 2 };
        bubbleSort.sort(outArray);
        assertArrayEquals(expectedArray, outArray);
    }

    @Test
    void testArrayRepeatingZeros() {
        int[] outArray = { -3, 0, 0 };
        int[] expectedArray = { -3, 0, 0 };
        bubbleSort.sort(outArray);
        assertArrayEquals(expectedArray, outArray);
    }

    @Test
    void testOrderedArray() {
        int[] outArray = { -3, -1, 0, 10 };
        int[] expectedArray = { -3, -1, 0, 10 };
        bubbleSort.sort(outArray);
        assertArrayEquals(expectedArray, outArray);
    }

    @Test
    void testNullArray() {
        assertThrows(NullPointerException.class, () -> bubbleSort.sort(null));
    }
}
