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
 * Unit test for simple App.
 */
class AppTest {

    private static final int[] POS_ORD = {0, 2, 6, 8};
    private static final int[] POS_DESORD = {8, 0, 2, 6};
    private static final int[] NEG_ORD = {-12, -7, -1, 0};
    private static final int[] NEG_DESORD =  {-7, -12, 0, -1};
    private static final int[] GRANDE_DESORD = {987987987, 10, 0, 1, -1, -83748332};
    private static final int[] GRANDE_ORD =   {-83748332, -1, 0, 1, 10, 987987987};

    private final BubbleSort bSorter = new BubbleSort();

    @Test
    void testOrdenacaoPositivos() {
        int[] values = POS_DESORD;
        bSorter.sort(values);
        assertArrayEquals(POS_ORD, values);
    }

    @Test
    void testOrdenacaoNegativos() {
        int[] values = NEG_DESORD;
        bSorter.sort(values);
        assertArrayEquals(NEG_ORD, values);
    }

    @Test
    void testNumerosGrandes() {
        int[] values = GRANDE_DESORD;
        bSorter.sort(values);
        assertArrayEquals(GRANDE_ORD, values);
    }
}
