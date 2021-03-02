package edu.ifrs.vvs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

public class BubbleSortTest {
    private BubbleSort bubbleSort;

    @BeforeEach
    void configTests() {
        bubbleSort = new BubbleSort();
    }


    /**
     * BubbleSort Test.
     */
    @Test
    @SuppressWarnings("checkstyle:magicnumber")
    void arraySort() {
        int[] arrayToTest = {1,4,2,8,7};
        bubbleSort.sort(arrayToTest);
        int[] expectedValue = {1,2,4,7,8};

        assertArrayEquals(expectedValue, arrayToTest);
    }

    @Test
    @SuppressWarnings("checkstyle:magicnumber")
    public void onlyWithOneValue() {
        int number = 13;
        int[] values = { number };

        bubbleSort.sort(values);
        assertEquals(number, values[0]);
    }
    @Test
    @SuppressWarnings("checkstyle:magicnumber")
    public void sortWithEmptyArray() {
        int[] integerArray = new int[] {};
        int[] sortedArray = new int[] {};
        bubbleSort.sort(integerArray);
        assertArrayEquals(integerArray, sortedArray);
    }
}
