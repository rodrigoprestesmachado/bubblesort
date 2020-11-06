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
 * Unit test for BubbleSort.
 */
@SuppressWarnings("checkstyle:magicnumber")
class AppTest {

    private BubbleSort bubbleSort = new BubbleSort();

    @Test
    void shouldOrderValuesAsExpected() {
        int[] values = {10, -1, 1, 5, 5, 0, 6};
        int[] expectedOrderedValues = {-1, 0, 1, 5, 5, 6, 10};

        bubbleSort.sort(values);

        assertArrayEquals(expectedOrderedValues, values);
    }
}
