package edu.ifrs.vvs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {
    private BubbleSort bubblesort = new BubbleSort();

    @Test
    public void sortWithRandomNumbers() {
        int[] integerArray = new int[] { 5, 9, 2, 8, 5, -4, 1, 0, 25 };
        int[] sortedArray = new int[] { -4, 0, 1, 2, 5, 5, 8, 9, 25 };
        bubblesort.sort(integerArray);
        Assertions.assertArrayEquals(integerArray, sortedArray);
    }

    @Test
    public void sortWithEmptyArray() {
        int[] integerArray = new int[] {};
        int[] sortedArray = new int[] {};
        bubblesort.sort(integerArray);
        Assertions.assertArrayEquals(integerArray, sortedArray);
    }
}
