package edu.ifrs.vvs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {
    BubbleSort algoritm = new BubbleSort();
    @Test
    void numberSorted(){
        int [] initial = {5, 3, 1};   
        algoritm.sort(initial);
        int [] expected = {1, 3, 5};   
        assertArrayEquals(expected, initial);    
    }    

    @Test
    void numberSortedWithNegativeNumber(){
        int [] initial = {-5, 3, 1};
        algoritm.sort(initial);
        int [] expected = {-5, 1, 3};   
        assertArrayEquals(expected, initial);  
    }        

    @Test
    void numberSortedWithRepeatedNumber(){
        int [] initial = {-15, 10, 10, 2, 2};
        algoritm.sort(initial);
        int [] expected = {-15, 2, 2, 10, 10};   
        assertArrayEquals(expected, initial);  
    }         
}