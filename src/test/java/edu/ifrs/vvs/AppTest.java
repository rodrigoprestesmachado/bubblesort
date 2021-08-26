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

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    private BubbleSort ordenador = new BubbleSort();

    @BeforeEach
    public void init() {
        ordenador = Mockito.mock(BubbleSort.class);
    }

    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    /**
     * Testing if the vector is empty.
     */
    @Test
    void testEmptyVector() {
        int[] valores = {};
        ordenador.sort(valores);
    }

    /**
     * Testing if the vector has only one element.
     */
    @Test
    @SuppressWarnings("checkstyle:magicnumber")
    void testVectorWithAnElement() {
        int[] valores = {33};
        ordenador.sort(valores);
        assertArrayEquals(new int[] {33}, valores);
    }

    /**
     * Testing ordering in normal situation.
     */
    @Test
    @SuppressWarnings("checkstyle:magicnumber")
    void testOrdering() {
        BubbleSort ord = new BubbleSort();
        int[] valores = {44, 77, 3, 26, 16};
        int[] ordemEsperada = {3, 16, 26, 44, 77};
        ord.sort(valores);
        assertArrayEquals(ordemEsperada, valores);

    }
}
