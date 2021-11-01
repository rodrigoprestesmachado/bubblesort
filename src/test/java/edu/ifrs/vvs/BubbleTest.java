package edu.ifrs.vvs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BubbleTest {
    BubbleSort bs = new BubbleSort();
    int[] values = {3, 9, 1};
    
    @Test
    void testBubble() {
             
       bs.sort(values);       
       assertEquals(1, bs.showFirstResult(values));  
    }
}
