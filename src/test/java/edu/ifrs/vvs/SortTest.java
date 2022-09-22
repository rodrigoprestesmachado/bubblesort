package edu.ifrs.vvs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests the sorting.
 */

@SuppressWarnings("MagicNumber")
public class SortTest {
    @Test
    void test1() {
        BubbleSort bs = new BubbleSort();
        int[] values = {3, 9, 1};
        bs.sort(values);
        assertEquals(1, bs.showFirstResult(values));
    }
}
