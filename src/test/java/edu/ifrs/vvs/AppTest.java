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

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */

    private BubbleSort bubble = new BubbleSort();

    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    @Test
    void testaComUmValor() {
        int[] umValor = {12};
        bubble.sort(umValor);
        int [] testador = {12};
        assertArrayEquals(umValor, testador);
    }

    @Test
    void testaComMaisValores(){
        int [] povoado = {12, 23, 7, 11};
        bubble.sort(povoado);
        int [] testador = {7,11,12,23};
        assertArrayEquals(povoado,testador);
    }

    @Test
    void testaMostrarSemOrganizarComVariosValores(){
        int [] povoado = {12, 23, 7, 11};
        bubble.show(povoado);
        int [] testador = {12, 23, 7, 11};
        assertArrayEquals(povoado,testador);
    }

    @Test
    void testaMostrarSemOrganizarComUmValor(){
        int [] umValor = {1};
        bubble.show(umValor);
        int [] testador = {1};
        assertArrayEquals(umValor, testador);
    }

}
