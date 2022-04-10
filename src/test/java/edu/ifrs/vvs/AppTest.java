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

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class AppTest {

    BubbleSort bolha = new BubbleSort();
    static int[] array1 = new int[4];
    static int[] array2 = new int[4];
    static int[] array3 = new int[10];

    @BeforeAll
    public static void init() {
        array1[0] = 6;
        array1[1] = 9;
        array1[2] = -5;
        array1[3] = -5000;
        array2[0] = 156842;
        array2[1] = 156841;
        array2[2] = 8;
        array2[3] = 7;
        array3[0] = 1;
        array3[1] = 1;
        array3[2] = 1;
        array3[3] = 1;
        array3[4] = 6;
        array3[5] = 9;
        array3[6] = 1;
        array3[7] = 1;
        array3[8] = 1;
        array3[9] = 1;
    }

    @Test
    void testApp1() {
        int[] expectedResultArray1 = { -5000, -5, 6, 9 };
        bolha.sort(array1);
        assertArrayEquals(expectedResultArray1, array1);
    }

    @Test
    void testApp2() {
        int[] expectedResultArray2 = { 7, 8, 156841, 156842 };
        bolha.sort(array2);
        assertArrayEquals(expectedResultArray2, array2);
    }

    @Test
    void testApp3() {
        int[] expectedResultArray3 = { 1, 1, 1, 1, 1, 1, 1, 1, 6, 9 };
        bolha.sort(array3);
        assertArrayEquals(expectedResultArray3, array3);
    }
}
