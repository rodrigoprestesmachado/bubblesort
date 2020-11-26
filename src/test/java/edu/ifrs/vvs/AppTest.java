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

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    //Teste com uma lista já ordenada
    @Test
    void sortSorted() {
        returnExpected(new int[]{0, 1}, new int[]{0, 1});
    }
    //Teste com uma lista não ordenada
    @Test
    void sortUnsorted() {
        returnExpected(new int[]{0, 1}, new int[]{1, 0});
    }
    //Teste para verificar uma lista parcialmente desordenada
    @Test
    void sortPartiallyUnsorted(){
        returnExpected(new int[]{0, 1, 2, 3}, new int[]{0, 2, 1, 3});
    }


    //Método para verificar se o método sort traz o resultado esperado
    private void returnExpected(int[] expected, int[] input) {
        BubbleSort bs = new BubbleSort();
        bs.sort(input);
        assertArrayEquals(expected, input);
    }


}
