/**
 * @License
 * Copyright 2020 Bubble Sort Application
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package edu.ifrs.vvs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Unit test for bubble sort.
 */
class BubbleSortTest {
    private BubbleSort bubbleSort;

    @BeforeEach
    void prepareTest() {
        bubbleSort = new BubbleSort();
    }

    @Test
    void sortEmptyArray() {
        // Arrange
        final int[] array = {};
        final int[] expectedArray = {};

        // Act
        bubbleSort.sort(array);

        // Assert
        assertArrayEquals(expectedArray, array);
    }

    @Test
    void sortOneItemArray() {
        // Arrange
        final int[] array = {0};
        final int[] expectedArray = {0};

        // Act
        bubbleSort.sort(array);

        // Assert
        assertArrayEquals(expectedArray, array);
    }

    @Test
    void sortAllPositiveArray() {
        // Arrange
        final int[] array = {8, 3, 5, 1};
        final int[] expectedArray = {1, 3, 5, 8};

        // Act
        bubbleSort.sort(array);

        // Assert
        assertArrayEquals(expectedArray, array);
    }

    @Test
    void sortAllNegativeArray() {
        // Arrange
        final int[] array = {-8, -3, -5, -1};
        final int[] expectedArray = {-8, -5, -3, -1};

        // Act
        bubbleSort.sort(array);

        // Assert
        assertArrayEquals(expectedArray, array);
    }

    @Test
    void sortMixedArray() {
        // Arrange
        final int[] array = {8, -3, 5, 0, -1};
        final int[] expectedArray = {-3, -1, 0, 5, 8};

        // Act
        bubbleSort.sort(array);

        // Assert
        assertArrayEquals(expectedArray, array);
    }

    @Test
    void sortNullArray() {
        final int[] array = null;
        Class<NullPointerException> expectedException = NullPointerException.class;

        assertThrows(expectedException, () -> bubbleSort.sort(array));
    }
}
