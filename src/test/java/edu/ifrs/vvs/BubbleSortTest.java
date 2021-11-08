package edu.ifrs.vvs;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class BubbleSortTest {

    BubbleSort bubbleSort = new BubbleSort();

    @Test
    public void mustReturnArrayWithNoRepeatedElementsSortedArray() {
        int[] actual = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] expected = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        bubbleSort.sort(actual);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void mustReturnArrayWithNoRepeatedElementsUnsortedArray() {
        int[] actual = new int[] { 5, 3, 1, 4, 2, 7, 6, 9, 8 };
        int[] expected = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        bubbleSort.sort(actual);

        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void mustReturnArrayWithRepeatedElementsSortedArray() {
        int[] actual = new int[] { 1, 1, 2, 3, 3, 4, 5, 6, 7, 8, 9, 9 };
        int[] expected = new int[] { 1, 1, 2, 3, 3, 4, 5, 6, 7, 8, 9, 9 };

        bubbleSort.sort(actual);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void mustReturnArrayWithRepeatedElementsUnsortedArray() {
        int[] actual = new int[] { 5, 3, 1, 7, 3, 4, 2, 7, 6, 9, 8, 5 };
        int[] expected = new int[] { 1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8, 9 };

        bubbleSort.sort(actual);

        assertArrayEquals(expected, actual);
    }
}
