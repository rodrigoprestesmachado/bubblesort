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

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class AppTest {


    @Test
    @DisplayName("test 1 elemento")
    @Order(1)
    void testAppOneElement() {
        BubbleSort buuble = new BubbleSort();
        int v[] = {1};
        int v2[] = {1};
        buuble.sort(v);
        assertArrayEquals(v, v2);
    }

    @Test
    @DisplayName("test 2 elementos")
    @Order(2)
    void testAppTwoElements() {
        BubbleSort buuble = new BubbleSort();
        int v[] = {1, 2};
        int v2[] = {1, 2};
        buuble.sort(v);
        assertArrayEquals(v, v2);
    }

    @Test
    @DisplayName("test 2 elementos invertidos")
    @Order(3)
    void testApp2ElementsReverse() {
        BubbleSort buuble = new BubbleSort();
        int v[] = {2, 1};
        int v2[] = {1, 2};
        buuble.sort(v);
        assertArrayEquals(v, v2);
    }

    @Test
    @DisplayName("test More elementos sortidos")
    @Order(4)
    void testAppMoreElementsSorted() {
        BubbleSort buuble = new BubbleSort();
        int v[] = {2, 1, 5, 4, 3, 8, 7, 6};
        int v2[] = {1, 2, 3, 4, 5, 6, 7, 8};
        buuble.sort(v);
        assertArrayEquals(v, v2);
    } 

    @Test
    @DisplayName("test elementos sortidos faltando")
    @Order(1)
    void testAppMissingSomeElementsSorted() {
        BubbleSort buuble = new BubbleSort();
        int v[] = {2, 1, 5, 3, 7, 6};
        int v2[] = {1, 2, 3, 5, 6, 7};
        buuble.sort(v);
        assertArrayEquals(v, v2);
    }

    @Test
    @DisplayName("test elementos sortidos faltando com zero")
    @Order(2)
    void testAppElementsSortedwithZero() {
        BubbleSort buuble = new BubbleSort();
        int v[] = {2, 1, 18015, 5, 3, 0, 6};
        int v2[] = {0, 1, 2, 3, 5, 6, 18015};
        buuble.sort(v);
        assertArrayEquals(v, v2);
    }

    @Test
    @DisplayName("test elementos sortidos faltando com zero e negativos")
    @Order(3)
    void testAppElementsSortedwithZeroandNegatives() {
        BubbleSort buuble = new BubbleSort();
        int v[] = {2, 1, 5, -10, 3, 1589, 0, 6};
        int v2[] = {-10, 0, 1, 2, 3, 5, 6, 1589};
        buuble.sort(v);
        assertArrayEquals(v, v2);
    }
}
