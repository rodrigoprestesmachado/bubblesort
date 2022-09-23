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
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Unit test for simple App.
 */
class AppTest {

    private static final int[] EXPECTED = {42};
    private static final int[] ONENUMBER = {42};
    private static final int[] NULL = null;
    private static final int[] UNORDERED_POSITIVE_NUMBERS = {30, 1, 12, 3, 10, 25};
    private static final int[] ORDERED_POSITIVE_NUMBERS = {1, 3, 10, 12, 25, 30};
    private static final int[] UNORDERED_NEGATIVE_NUMBERS = {-3, -5, -2};
    private static final int[] ORDERED_NEGATIVE_NUMBERS = {-5, -3, -2};

    private BubbleSort sort = new BubbleSort();

    /**
     Rigorous Test.
    **/
    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    @Test
    void testNull() {
        assertThrows(NullPointerException.class, () -> sort.sort(NULL));
    }

    @Test
    void testOneNumber() {
        sort.sort(ONENUMBER);
        assertArrayEquals(ONENUMBER, EXPECTED);
    }

    @Test
    void testPositive() {
        sort.sort(UNORDERED_POSITIVE_NUMBERS);
        assertArrayEquals(ORDERED_POSITIVE_NUMBERS, UNORDERED_POSITIVE_NUMBERS);
    }

    @Test
    void testNegative() {
        sort.sort(UNORDERED_NEGATIVE_NUMBERS);
        assertArrayEquals(ORDERED_NEGATIVE_NUMBERS, UNORDERED_NEGATIVE_NUMBERS);
    }

}
