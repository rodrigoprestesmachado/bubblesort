package edu.ifrs.vvs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {

    


   /**
    *
    */
   @Test
   void testSort (){
   int v[] = {1,2,3,4,5};
   int aux[] = v;
   assertEquals(v, aux);
   }


   /**
    *
    */
   @Test
   @DisplayName ("Ordem certa")
   void testSort1(){
   BubbleSort bs = new BubbleSort();
   int value [] = {2,4,6};
   bs.sort(value);
   assertEquals(2, bs.showFirstResult(value));
  
   }


}


