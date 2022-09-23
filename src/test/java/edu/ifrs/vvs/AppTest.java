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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testArraySortSuccess() {
        BubbleSort b = new BubbleSort();
        int[] intArray = new int[]{ 1,10,2,9,3};
        b.sort(intArray);
        assertEquals(1, intArray[0]);
        assertEquals(10, intArray[4]);
    }

    /**
     * 
     */
    @Test
    void testArraySortFail() {
        BubbleSort b = new BubbleSort();
        int[] intArray = new int[]{ 1,10,2,9,3};
        b.sort(intArray);
        assertNotEquals(10, intArray[0]);
        assertNotEquals(1, intArray[4]);
    }
}
