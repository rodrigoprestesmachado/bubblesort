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
public class AppTest {

    private BubbleSort bs = new BubbleSort();

    /**
     * Ordena valores únicos.
     */
    @SuppressWarnings("checkstyle:magicnumber")
    @Test
    public void ordenaUnicos() {
        int[] ordenado = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] desordenado = {7, 9, 3, 10, 5, 6, 1, 8, 2, 4};
        bs.sort(desordenado);
        assertArrayEquals(ordenado, desordenado);
    }

    /**
     * Ordena sem valores.
     */
    @SuppressWarnings("checkstyle:magicnumber")
    @Test
    public void ordenaNulo() {
        int[] ordenado = {};
        int[] desordenado = {};
        bs.sort(desordenado);
        assertArrayEquals(ordenado, desordenado);
    }

    /**
     * Ordena com alguns valores repetidos.
     */
    @SuppressWarnings("checkstyle:magicnumber")
    @Test
    public void ordenaRepetidos() {
        int[] ordenado = {1, 2, 2, 2, 2, 6, 7, 8, 9, 10};
        int[] desordenado = {10, 7, 2, 1, 2, 6, 2, 8, 9, 2};
        bs.sort(desordenado);
        assertArrayEquals(ordenado, desordenado);
    }

    /**
     * Ordena incluindo valores negativos.
     */
    @SuppressWarnings("checkstyle:magicnumber")
    @Test
    public void ordenaComNegativos() {
        int[] ordenado = {-6, -3, 0, 1, 7, 8, 9, 10, 15, 17};
        int[] desordenado = {10, 8, 17, 0, 7, -3, 9, -6, 15, 1};
        bs.sort(desordenado);
        assertArrayEquals(ordenado, desordenado);
    }

    /**
     * Ordena com todos valores iguais.
     */
    @SuppressWarnings("checkstyle:magicnumber")
    @Test
    public void ordenaIguais() {
        int[] ordenado = {3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        int[] desordenado = {3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        bs.sort(desordenado);
        assertArrayEquals(ordenado, desordenado);
    }

    /**
     * Ordena um valor.
     */
    @SuppressWarnings("checkstyle:magicnumber")
    @Test
    public void ordenaUmValor() {
        int[] ordenado = {6};
        int[] desordenado = {6};
        bs.sort(desordenado);
        assertArrayEquals(ordenado, desordenado);
    }

}
