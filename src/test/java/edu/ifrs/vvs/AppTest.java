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

/**
 * Unit test for simple App.
 */
class AppTest {

    private BubbleSort bubble = new BubbleSort();
    /**
     * Rigorous Test.
     */

    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    @SuppressWarnings("checkstyle:magicnumber")
    @Test
    void testVetOrder() {
        int[] inicial = {8, 6, 2, 9};
        int[] order = {2, 6, 8, 9};
        bubble.sort(inicial);
        assertArrayEquals(order, inicial);
    }
}
