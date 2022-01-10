package edu.ifrs.vvs;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {

    BubbleSort bubbleSort = new BubbleSort();
    int[] postiveNumbers = {1,2,3,4,5};
    int[] negativeNumbers = {-1,-2,-4,-5,-3};

    @Test
    @DisplayName("should sort an array of numbers")
    public void bubbleSortTest() {
        int [] correctSortedValues = {1,2,3,4,5};
        bubbleSort.sort(postiveNumbers);
        assertArrayEquals(correctSortedValues, postiveNumbers);
    }

    @Test
    @DisplayName("should sort an array of negative numbers")
    public void bubbleSortTestNegativeNumbers() {
        int [] correctSortedValues = {-5,-4,-3,-2,-1};
        bubbleSort.sort(negativeNumbers);
        assertArrayEquals(correctSortedValues, negativeNumbers);
    }
}