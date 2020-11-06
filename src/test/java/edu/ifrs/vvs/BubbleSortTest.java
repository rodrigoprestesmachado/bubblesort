package edu.ifrs.vvs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * bubble test.
 */
public class BubbleSortTest {

    private BubbleSort bubble = new BubbleSort();

    @SuppressWarnings("checkstyle:magicnumber")
    @Test
    void testVet() {
        int[] num = {10};
        bubble.sort(num);
        assertArrayEquals(new int[] {10}, num);
    }

    @SuppressWarnings("checkstyle:magicnumber")
    @Test
    void testVetOrder() {
        int[] num = {8, 6, 9};
        int[] order = {6, 8, 9};
        bubble.sort(num);
        assertArrayEquals(order, num);
    }

    @SuppressWarnings("checkstyle:magicnumber")
    @Test
    void testVetNull() {
        int[] num = {};
        int[] order = {};
        bubble.sort(num);
        assertArrayEquals(order, num);
    }

    @SuppressWarnings("checkstyle:magicnumber")
    @Test
    void testVetNegative() {
        int[] num = {-6, -2, -8};
        int[] order = {-8, -6, -2};
        bubble.sort(num);
        assertArrayEquals(order, num);
    }
}
