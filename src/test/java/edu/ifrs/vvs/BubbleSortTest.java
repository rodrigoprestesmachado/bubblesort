package edu.ifrs.vvs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Unit test for simple App.
 */
public class BubbleSortTest {
    /**
     * Testing if the numbers were sorted.
     */
    @Test
    void numberSorted() {
        BubbleSort algoritm = new BubbleSort();
        int[] initial = {5, 3, 1};   
        algoritm.sort(initial);
        int[] expected = {1, 3, 5};   
        assertArrayEquals(expected, initial);    
    }    

    /**
     * Testing if negative number were sorted.
     */
    @Test
    void numberSortedWithNegativeNumber() {
        BubbleSort algoritm = new BubbleSort();
        int[] initial = {-5, 3, 1};
        algoritm.sort(initial);
        int[] expected = {-5, 1, 3};   
        assertArrayEquals(expected, initial);  
    }        

    /**
     * Testing if repeated numbers were considered.
     */
    @Test
    void numberSortedWithRepeatedNumber() {
        BubbleSort algoritm = new BubbleSort();
        int[] initial = {-15, 10, 10, 2, 2};
        algoritm.sort(initial);
        int[] expected = {-15, 2, 2, 10, 10};   
        assertArrayEquals(expected, initial);  
    }         
}
