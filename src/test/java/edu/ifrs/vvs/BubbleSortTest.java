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

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Unit test for BubbleSort.
 */
class BubbleSortTest {
    private BubbleSort bubble = new BubbleSort();
    /**
     * BubbleSort odd numbers Test.
     */

    @Test
    @SuppressWarnings("checkstyle:magicnumber")
    void oddSortTest() {
        int[] odd = new int[] {3, 7, 5, 11};
        int[] expectedOdd = new int[] {3, 5, 7, 11};
        bubble.sort(odd);
        assertArrayEquals(expectedOdd, odd);
    }

    /**
     * BubbleSort even numbers Test.
     */

    @Test
    @SuppressWarnings("checkstyle:magicnumber")
    void evenSortTest() {
        int[] odd = new int[] {8, 24, 4, 12};
        int[] expectedOdd = new int[] {4, 8, 12, 24};
        bubble.sort(odd);
        assertArrayEquals(expectedOdd, odd);
    }

    /**
     * BubbleSort even and odd numbers Test.
     */

    @Test
    @SuppressWarnings("checkstyle:magicnumber")
    void oddAndEvenSortTest() {
        int[] odd = new int[] {5, 24, 7, 16};
        int[] expectedOdd = new int[] {5, 7, 16, 24};
        bubble.sort(odd);
        assertArrayEquals(expectedOdd, odd);
    }

}
