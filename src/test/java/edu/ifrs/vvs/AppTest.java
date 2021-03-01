/**
 * @License Copyright 2020 Bubble Sort Application
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package edu.ifrs.vvs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */

    private final BubbleSort bubbleSort = new BubbleSort();
    List<Integer> array = new ArrayList<>();

    @BeforeEach
    void init() {
        array.add(2);
        array.add(8);
        array.add(3);
        array.add(4);
        array.add(9);
    }

    @AfterEach
    public void restoreList() {
        array.clear();
    }

    @Test
    @DisplayName("Testing BubbleSort with positive numbers")
    void testPositiveNumbers() {
        int[] test = new int[array.size()];

        for (int i = 0; i < array.size(); i++) {
            test[i] = array.get(i);
        }

        bubbleSort.sort(test);

        List<Integer> result = Arrays.stream(test)
                                     .map(Integer::new)
                                     .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        assertEquals(5, result.size());

        assertEquals(2, result.get(0));
        assertEquals(3, result.get(1));
        assertEquals(4, result.get(2));
        assertEquals(8, result.get(3));
        assertEquals(9, result.get(4));
    }

    @Test
    @DisplayName("Testing BubbleSort with positive and negative numbers")
    void testPositiveAndNegativeNumbers() {
        array.add(-1);
        array.add(-6);
        array.add(-8);
        array.add(-12);
        array.add(0);

        int[] test = new int[array.size()];

        for (int i = 0; i < array.size(); i++) {
            test[i] = array.get(i);
        }

        bubbleSort.sort(test);

        List<Integer> result = Arrays.stream(test)
                                     .map(Integer::new)
                                     .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        assertEquals(10, result.size());

        assertEquals(-12, result.get(0));
        assertEquals(-8, result.get(1));
        assertEquals(-6, result.get(2));
        assertEquals(-1, result.get(3));
        assertEquals(0, result.get(4));

        assertEquals(2, result.get(5));
        assertEquals(3, result.get(6));
        assertEquals(4, result.get(7));
        assertEquals(8, result.get(8));
        assertEquals(9, result.get(9));
    }

    @Test
    @DisplayName("Testing BubbleSort with duplicate numbers")
    void testDuplicateNumbers() {
        array.add(9);
        array.add(9);

        int[] test = new int[array.size()];

        for (int i = 0; i < array.size(); i++) {
            test[i] = array.get(i);
        }

        bubbleSort.sort(test);

        List<Integer> result = Arrays.stream(test)
                                     .map(Integer::new)
                                     .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        assertEquals(7, result.size());

        assertEquals(2, result.get(0));
        assertEquals(3, result.get(1));
        assertEquals(4, result.get(2));
        assertEquals(8, result.get(3));
        assertEquals(9, result.get(4));
        assertEquals(9, result.get(5));
        assertEquals(9, result.get(6));
    }
}
