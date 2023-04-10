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
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

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

    @Test
    @DisplayName("Teste funcionamento regular")
    void testBubbleOrdenado() {
        int [] entrada = {2, 5, 3, 6, 4, 1};
        int [] saida = {1, 2, 3, 4, 5, 6};
        new BubbleSort().sort(entrada);
        assertArrayEquals(entrada, saida, "Muito bem, Taíse!");
    }

    @Test
    @DisplayName("Teste com valor null")
    void testBubbleValorNull() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            int [] entradaNull = null;
            new BubbleSort().sort(entradaNull);
        });
    }

    @Test
    @DisplayName("Teste com array vazio")
    void testBubbleArrayVazio() {
        int [] entrada = {};
        int [] saida = {};
        Assertions.assertArrayEquals(entrada, saida);
    }
}

