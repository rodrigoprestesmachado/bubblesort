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

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.TimeUnit;

/**
 * Unit test for a bubbleSort
 */
class AppTest {
    /**
     * Rigorous Test.
     */
   
    private BubbleSort bubbleSort = new BubbleSort(); //inicializa o array

    
    @Test
    @DisplayName("Teste inicial que já estava no código do professor")
    void testApp() {
        assertEquals(1, 1);
    }//esse aqui o professor já fez, precisa deixar?

    @Test
    @DisplayName("Tamanho dos arrays")
    void testSortArrayLenght(){
        int [] array1 = {1,2,3,4,5,6,7,8,9,10};
        int [] array2 = {1,2,3,4,5,6,7,8,9,10};
        bubbleSort.sort(array2);
        assertEquals( array1.length, array2.length, "Se o teste falhou, o tamanho do bubblesort não é igual");

    }

    @Test
    @DisplayName("Array de números embaralhados")
    void testSortArrayEquals(){
        int[] array1 = {0,2,4,6,8};
        int[] array2 = {6,2,0,8,4};
        bubbleSort.sort(array2);
        assertArrayEquals(array1, array2, "Se o teste falhou, o conteúdo do bubblesort não é igual");

    }

    @Test
    @DisplayName("Array com números já ordenados")
    void testOrderedArray(){
        int[] array1 = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
        int[] array2 = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
        bubbleSort.sort(array2);
        assertNotEquals(array1, array2, "Teste deve passar se os arrays estão ordenados");
    }
    

    @Test
    @DisplayName("Arrays não são iguais")
    void testSortNotSame(){
        int[] array1 = {3,6,9,12,15};
        int[] array2 = {9,18,27,36,45};
        bubbleSort.sort(array2);
        assertNotEquals(array1, array2, "Teste deve passar se os arrays NÃO são iguais!");
    }
    
    @Test
    @DisplayName("Array unitário")
    void testSortArrayOneElement(){
        int[] array1 = {42};
        int[] array2 = {42};
        bubbleSort.sort(array2);
        assertArrayEquals(array1, array2, "Se o teste falhou, o bubblesort não funciona quando o array tem apenas um elemento");

    }



    @Test
    @DisplayName("Array com números positivos repetidos")
    void testArrayRepeatingPositives(){
        int[] array1 = {2,22,22,202};
        int[] array2 = {22,202,2,22};
        bubbleSort.sort(array2);
        assertArrayEquals(array1, array2, "Se o teste falhou, o bublesort não lida bem com positivos repetidos");
    }

    
    @Test
    @DisplayName("Array com zeros repetidos")
    void testArrayRepeatingZeros(){
        int[] array1 = {0,0,8};
        int[] array2 = {0,8,0};
        bubbleSort.sort(array2);
        assertArrayEquals(array1, array2, "Se o teste falhou, o bublesort não lida bem com zeros repetidos");
    }

    @Test
    @DisplayName("Array com negativos")
    void testArrayNegatives(){
        int[] array1 = {-666,-273, -1, 0, 1, 273, 666};
        int[] array2 = {666, -273, 0, -1, -666, 1, 273};
        bubbleSort.sort(array2);
        assertArrayEquals(array1, array2, "Se o teste falhou, o bublesort não lida bem com negativos");
        
    }
    @Test
    @DisplayName("Array com números negativos repetidos")
    void testArrayRepeatingNegatives(){
        int[] array1 = {-404,-404,0,404,4004};
        int[] array2 = {4004,0,-404,404,-404};
        bubbleSort.sort(array2);
        assertArrayEquals(array1, array2, "Se o teste falhou, o bublesort não lida bem com negativos repetidos");
    }

    @Test
    @DisplayName("Array Null")
    void testNullArray(){
        assertThrows(NullPointerException.class, () -> bubbleSort.sort(null));
    }

    @Test //--> testar com sleep, este teste deve reprovar! Se utilizar a notação da tag, para escrever o test precisaria trocar o assert para assertThrows e lidar com o erro! 
    @DisplayName("Falha de timeout") 
    @Timeout(5) //quando não especifica unidade, o padrão é segundos
    void testSortTimeout() throws InterruptedException{
        int [] array1 = {1,2,3,4,5,6,7,9,10};
        int [] array2 = {1,2,3,4,5,6,7,8,9,10};
        TimeUnit.SECONDS.sleep(10);
        bubbleSort.sort(array2);
 
        //assertNotSame(getClass(), getClass(), null); -> Não entendi essa parte do GetClass
     
    }

}
