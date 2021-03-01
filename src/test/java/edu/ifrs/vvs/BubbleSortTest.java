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

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

/**
 * Unit test for simple App.
 */
class BubbleSortTest {
    /**
     * Rigorous Test.
     */
    private BubbleSort bubblesort = new BubbleSort();

    @Test
    @DisplayName("Ordenação de números randômicos")
    public void sortWithRandomNumbers() {
        int[] arrayInicial = new int[] {2, -6, 3, 78, 26, 3, 5, 12};
        int[] arrayOrdenado = new int[] {-6, 2, 3, 3, 5, 12, 26, 78 };
        bubblesort.sort(arrayInicial);
        Assertions.assertArrayEquals(arrayInicial, arrayOrdenado);
    }

    @Test
    @DisplayName("Ordenação de números iguais")
    public void sortWithEqualNumbers() {
        int[] arrayInicial = new int[] {2, 2, 2, 2, 2};
        int[] arrayOrdenado = new int[] {2, 2, 2, 2, 2};
        bubblesort.sort(arrayInicial);
        Assertions.assertArrayEquals(arrayInicial, arrayOrdenado);
    }

    @Test
    @DisplayName("Ordenação de array vazio")
    public void sortWithEmptyArray() {
        int[] arrayInicial = new int[] {};
        int[] arrayOrdenado = new int[] {};
        bubblesort.sort(arrayInicial);
        Assertions.assertArrayEquals(arrayInicial, arrayOrdenado);
    }

    
}
