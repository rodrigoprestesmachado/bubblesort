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
    /**
     * Rigorous Test.
     */
    private static final int[] DESORDENANDO = {2, 1, 4, 3, 6, 5};
    private static final int[] ORDENADO = {1, 2, 3, 4, 5, 6};
    private BubbleSort Bubble = new BubbleSort();

    @Test
    void testApp() {
        int[] values = DESORDENANDO;
        Bubble.sort(values);
        assertArrayEquals(ORDENADO, values);
    }
}
