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
    private static final Integer ZERO = 0;
    private static final Integer MENOS_DOZE = -12;
    private static final Integer MENOS_OITO = -8;
    private static final Integer MENOS_SEIS = -6;
    private static final Integer MENOS_UM = -1;
    private static final Integer UM = 1;
    private static final Integer DOIS = 2;
    private static final Integer TRES = 3;
    private static final Integer QUATRO = 4;
    private static final Integer CINCO = 5;
    private static final Integer SEIS = 6;
    private static final Integer SETE = 7;
    private static final Integer OITO = 8;
    private static final Integer NOVE = 9;
    private static final Integer DEZ = 10;

    private final BubbleSort bubbleSort = new BubbleSort();
    private final List<Integer> array = new ArrayList<>();

    @BeforeEach
    void init() {
        array.add(DOIS);
        array.add(OITO);
        array.add(TRES);
        array.add(QUATRO);
        array.add(NOVE);
    }

    @AfterEach
    public void restoreList() {
        array.clear();
    }

    @Test
    @DisplayName("Testing BubbleSort with positive numbers")
    void testPositiveNumbers() {
        int[] test = new int[array.size()];

        for (int i = ZERO; i < array.size(); i++) {
            test[i] = array.get(i);
        }

        bubbleSort.sort(test);

        List<Integer> result = Arrays.stream(test)
                                     .map(Integer::new)
                                     .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        assertEquals(CINCO, result.size());

        assertEquals(DOIS, result.get(ZERO));
        assertEquals(TRES, result.get(UM));
        assertEquals(QUATRO, result.get(DOIS));
        assertEquals(OITO, result.get(TRES));
        assertEquals(NOVE, result.get(QUATRO));
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

        assertEquals(DEZ, result.size());

        assertEquals(MENOS_DOZE, result.get(ZERO));
        assertEquals(MENOS_OITO, result.get(UM));
        assertEquals(MENOS_SEIS, result.get(DOIS));
        assertEquals(MENOS_UM, result.get(TRES));
        assertEquals(ZERO, result.get(QUATRO));

        assertEquals(DOIS, result.get(CINCO));
        assertEquals(TRES, result.get(SEIS));
        assertEquals(QUATRO, result.get(SETE));
        assertEquals(OITO, result.get(OITO));
        assertEquals(NOVE, result.get(NOVE));
    }

    @Test
    @DisplayName("Testing BubbleSort with duplicate numbers")
    void testDuplicateNumbers() {
        array.add(NOVE);
        array.add(NOVE);

        int[] test = new int[array.size()];

        for (int i = ZERO; i < array.size(); i++) {
            test[i] = array.get(i);
        }

        bubbleSort.sort(test);

        List<Integer> result = Arrays.stream(test)
                                     .map(Integer::new)
                                     .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        assertEquals(SETE, result.size());

        assertEquals(DOIS, result.get(ZERO));
        assertEquals(TRES, result.get(UM));
        assertEquals(QUATRO, result.get(DOIS));
        assertEquals(OITO, result.get(TRES));
        assertEquals(NOVE, result.get(QUATRO));
        assertEquals(NOVE, result.get(CINCO));
        assertEquals(NOVE, result.get(SEIS));
    }
}
