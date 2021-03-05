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
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */

class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    @DisplayName("Teste básico")
    void testApp() {
        assertEquals(1, 1);
    }

    /**
     * Test of bubblesort class.
     */
    @Test
    @SuppressWarnings("checkstyle:magicnumber, linelength")
    @DisplayName("Deve retornar na ordem certa")
    void testaOrdem() {
        BubbleSort bs = new BubbleSort();
        int[] firstValue = {10, 3, 1};
        int[] firstExpected = {1, 3, 10};
        int[] thirdExpected = {8, 20, 22, 33, 66, 77, 112, 8712, 333333};
        int[] secondValue = {5, 30, 999, 1, 222, 9, 10};
        int[] secondExpected = {1, 5, 9, 10, 30, 222, 999};
        int[] thirdValue = {8, 20, 33, 66, 77, 22, 333333, 112, 8712};
        bs.sort(firstValue);
        bs.sort(secondValue);
        bs.sort(thirdValue);
        assertAll(() -> assertArrayEquals(firstExpected, firstValue),
            () -> assertArrayEquals(secondExpected, secondValue),
            () -> assertArrayEquals(thirdExpected, thirdValue));
    }
}
