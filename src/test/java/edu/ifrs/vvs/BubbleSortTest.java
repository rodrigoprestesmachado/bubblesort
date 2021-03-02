package edu.ifrs.vvs;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BubbleSortTest {
    BubbleSort bubbleSort = new BubbleSort();
    
    @Test
    public void orderingVetor() {
        int[] values = { 9, -3, 5, 0, 1 };
        int[] expectedOrder = { -3, 0, 1, 5, 9 };
 
        bubbleSort.sort(values); 
        assertArrayEquals(expectedOrder, values);
    }

    @Test
    public void onlyOneValue() {
        int[] values = { 13 };
        int[] expectedOrder = { 13 };
 
        bubbleSort.sort(values); 
        assertEquals(expectedOrder[0], values[0]);
    }

    @Test
    public void arrayEmpty() {
        int[] values = { };
 
        bubbleSort.sort(values); 
        assertTrue(values.length == 0);
    }
}