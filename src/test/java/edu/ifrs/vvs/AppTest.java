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

    private static final int[] POS_ORD = {0, 2, 6, 8};
    private static final int[] POS_DESORD = {8, 0, 2, 6};
    private static final int SMALL_NEGATIVE = -3;
    private static final int SMALL_POSITIVE = 3;

    private final BubbleSort bSorter = new BubbleSort();

    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    @Test
    void testOrdenacaoSimples() {
        int[] values = POS_DESORD;
        bSorter.sort(values);
        assertArrayEquals(POS_ORD, values);
    }
}
