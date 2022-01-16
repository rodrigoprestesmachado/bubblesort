package edu.ifrs.vvs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BubbleSortTest {

    BubbleSort bubbleSort = new BubbleSort();

    @Test
    void assertOrderPositiveNumbers() {
        int inputData[] = { 32, 4, 6, 90, 79 };
        int expectedOutput[] = { 4, 6, 32, 79, 90 };
        bubbleSort.sort(inputData);
        assertTrue(Arrays.equals(expectedOutput, inputData));
    }

    @Test
    void assertOrderNegativeNumbers() {
        int input[] = { -32, -4, -6, -90, -79 };
        int expectedOutput[] = { -90, -79, -32, -6, -4 };
        bubbleSort.sort(input);
        assertTrue(Arrays.equals(expectedOutput, input));
    }

    @Test
    @DisplayName("Copare order array with number zero and negative number")
    void assertOrderWithZeroNumbers() {
        int input[] = { 1, 10, 0, -1};
        int expectedOutput[] = { -1, 0, 1, 10 };
        bubbleSort.sort(input);
        assertTrue(Arrays.equals(expectedOutput, input));
    }

    @Test
    @DisplayName("When two arrays refer to the same order")
    void givenAnArrayMustBeOrderedEqually() {
        int input[] = {5, 3 , 1, 7, 4};
        int expectedOutput[] = {1, 3, 4, 5, 7};
        bubbleSort.sort(input);

        assertArrayEquals(expectedOutput, input, "array match !");
    }
}
