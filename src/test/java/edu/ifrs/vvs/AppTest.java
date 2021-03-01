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
 * Unit test for Bubblesort.
 */
class AppTest {

    private BubbleSort bubbleSort = new BubbleSort();

    /**
     * Rigorous Test.
     */
    
    @SuppressWarnings("checkstyle:magicnumber")
    @Test
    void testAppVetor() {
        int[] valores = { 10 };
        bubbleSort.sort(valores);
        assertArrayEquals(new int[] { 10 }, valores);
    }

    @SuppressWarnings("checkstyle:magicnumber")
    @Test
    void testAppVetorNull() {
        int[] valores = {};
        int[] ordemEsperada = {};
        bubbleSort.sort(valores);
        assertArrayEquals(ordemEsperada, valores);
    }
    
    @SuppressWarnings("checkstyle:magicnumber")
    @Test
    void testAppVetorOrdem() {
        int[] valores = {108, 88, 18, 57, -2};
        int[] ordemEsperada = {-2, 18, 57, 88, 108};
        bubbleSort.sort(valores);
        assertArrayEquals(ordemEsperada, valores);
    }


}
