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

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for BubbleSort class.
 */
class BubbleSortTest {
    /**
     * Rigorous Test.
    */

    private BubbleSort bubbleSort;

    @BeforeEach
    public void setup() {
        bubbleSort = new BubbleSort();
    }

    @Test
    @SuppressWarnings("checkstyle:magicnumber")
    @DisplayName("Pequeno array desordenado.")
    void testSmallUnorderedArray() {
        int[] testCase = new int[]{3, 5, 4, 1, 9, 6, 7, 2};
        int[] gabarito = new int[]{1, 2, 3, 4, 5, 6, 7, 9};
        bubbleSort.sort(testCase);
        assertTrue(Arrays.equals(testCase, gabarito));
    }

    @Test
    @SuppressWarnings("checkstyle:magicnumber")
    @DisplayName("Pequeno array ordenado.")
    void testSmallOrderedArray() {
        int[] testCase = new int[]{1, 2, 3, 4, 5, 6, 7, 9};
        int[] gabarito = new int[]{1, 2, 3, 4, 5, 6, 7, 9};
        bubbleSort.sort(testCase);
        assertTrue(Arrays.equals(testCase, gabarito));
    }

    @Test
    @SuppressWarnings("checkstyle:magicnumber")
    @DisplayName("Médio array desordenado.")
    void testMediumUnorderedArray() {
        int[] testCase = new int[]{3, 5, 4, 1, 9, 6, 7, 2, 3, 5, 7, 2, 5, 2, 4, 6, 8, 0, 4, 2, 1, 5, 7, 8, 9};
        int[] gabarito = new int[]{0, 1, 1, 2, 2, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5, 5, 6, 6, 7, 7, 7, 8, 8, 9, 9};
        bubbleSort.sort(testCase);
        assertTrue(Arrays.equals(testCase, gabarito));
    }

    @Test
    @SuppressWarnings("checkstyle:magicnumber")
    @DisplayName("Médio array ordenado.")
    void testMediumOrderedArray() {
        int[] testCase = new int[]{0, 1, 1, 2, 2, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5, 5, 6, 6, 7, 7, 7, 8, 8, 9, 9};
        int[] gabarito = new int[]{0, 1, 1, 2, 2, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5, 5, 6, 6, 7, 7, 7, 8, 8, 9, 9};
        bubbleSort.sort(testCase);
        assertTrue(Arrays.equals(testCase, gabarito));
    }
}
