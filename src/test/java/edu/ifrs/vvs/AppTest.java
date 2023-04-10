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
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

import org.junit.jupiter.api.DisplayName;

/**
 * Unit test for simple App.
 */
class AppTest {
    private BubbleSort bubble = new BubbleSort();
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    @Test
    @DisplayName("Arrays com mesmos valores em ordens diferentes")
    void testSort1(){
        int [] valores = {4, 1, 9, 0};
        int [] ordenados = {0, 1, 4, 9};

        bubble.sort(valores);

        assertArrayEquals(valores, ordenados);
    }

    @Test
    @DisplayName("Arrays com valores diferentes")
    void testSort2(){
        int [] valores = {0, 1, 4, 9};
        int [] ordenados = {7, 23, 9, 0};

        bubble.sort(ordenados);

        assertNotEquals(valores, ordenados);
    }

    @Test
    @DisplayName("Arrays com valores iguais em ordens diferentes, poucos itens")
    void testSort3(){
        int [] valores = {9, 4, 1, 0};
        int [] ordenados = {0, 1, 4, 9};
        
        bubble.sort(valores);

        assertArrayEquals(valores, ordenados);
    }

    @Test
    @DisplayName("Arrays com valores mais valores com ordenação correta")
    void testSort4(){
        int [] valores = {2, 34, 90, 200, 109866, 92929, 0, 1, 4, 9};
        int [] ordenados = {0, 1, 2, 4, 9, 34, 90, 200, 92929, 109866};
        
        bubble.sort(valores);

        assertArrayEquals(valores, ordenados);
    }

    @Test
    @DisplayName("Arrays com valores mais valores não ordenados")
    void testSort5(){
        
        int [] valores = {0, 1, 2, 4, 9, 34, 90, 200, 92929, 109866};
        int [] ordenados = {2, 34, 90, 200, 109866, 92929, 0, 1, 4, 9};
        
        bubble.sort(valores);

        assertArrayEquals(valores, ordenados);
    }

    @Test
    @DisplayName("Arrays com mais valores ordenados")
    void testSort6(){
        
        int [] valores = {2, 34, 90, 200, 109866, 92929, 0, 1, 4, 9};
        int [] ordenados = {0, 1, 2, 4, 9, 34, 90, 200, 92929, 109866};
        
        bubble.sort(valores);

        assertNotSame(valores, ordenados);
    }
}
