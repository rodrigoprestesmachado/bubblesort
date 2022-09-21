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
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */

    private BubbleSort sorteador = new BubbleSort();

    @Test
    void testandoComValorVazio() {
        final int[] valores = {};
        final int[] arrayEsperado = {};

        sorteador.sort(valores);
        assertArrayEquals(arrayEsperado, valores);
    }

    @Test
    void testandoComDoisValores() {
        final int[] valores = {2, 1};
        final int[] arrayEsperado = {1, 2};

        sorteador.sort(valores);
        assertArrayEquals(arrayEsperado, valores);
    }

    @Test
    void testandoComQuatroValores() {
        final int[] valores = {99, 2, 1, -50};
        final int[] arrayEsperado = {-50, 1, 2, 99};

        sorteador.sort(valores);
        assertArrayEquals(arrayEsperado, valores);
    }

    @Test
    void testandoComOitoValores() {
        final int[] valores = {99, 2, 1, -50, -25, 30, -60, 41};
        final int[] arrayEsperado = {-60, -50, -25, 1, 2, 30, 41, 99};

        sorteador.sort(valores);
        assertArrayEquals(arrayEsperado, valores);
    }

    @Test
    void testandoValorNulo() {
        assertThrows(NullPointerException.class, () -> sorteador.sort(null));
    }
}
