package edu.ifrs.vvs;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {
    BubbleSort bubbleSort;
    
    @BeforeEach
    void prepareTest() {
        bubbleSort = new BubbleSort();
    }

    @Test
    void sortEmptyArray() {
        // Arrange
        int[] array = {};
        int[] expectedArray = {};

        // Act
        bubbleSort.sort(array);

        // Assert
        assertArrayEquals(expectedArray, array);
    }

    @Test
    void sortOneItemArray() {
        // Arrange
        int[] array = { 0 };
        int[] expectedArray = { 0 };

        // Act
        bubbleSort.sort(array);

        // Assert
        assertArrayEquals(expectedArray, array);
    }

    @Test
    void sortAllPositiveArray() {
        // Arrange
        int[] array = { 8, 3, 5, 1};
        int[] expectedArray = { 1, 3, 5, 8 };

        // Act
        bubbleSort.sort(array);

        // Assert
        assertArrayEquals(expectedArray, array);
    }

    @Test
    void sortAllNegativeArray() {
        // Arrange
        int[] array = { -8, -3, -5, -1};
        int[] expectedArray = { -8, -5, -3, -1 };

        // Act
        bubbleSort.sort(array);

        // Assert
        assertArrayEquals(expectedArray, array);
    }

    @Test
    void sortMixedArray() {
        // Arrange
        int[] array = { 8, -3, 5, 0, -1};
        int[] expectedArray = { -3, -1, 0, 5, 8 };

        // Act
        bubbleSort.sort(array);

        // Assert
        assertArrayEquals(expectedArray, array);
    }

    @Test
    void sortNullArray() {
        int[] array = null;
        Class<NullPointerException> expectedException = NullPointerException.class;

        assertThrows(expectedException, () -> bubbleSort.sort(array));
    }
}
