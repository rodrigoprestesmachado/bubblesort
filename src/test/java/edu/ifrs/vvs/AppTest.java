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
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    private static <int> bubblesort;

    @BeforeAll
    p//preciso inicializar este inferno, como faço isso?
    
    @Test
    void testApp() {
        assertEquals(1, 1);
    }//esse aqui o professor já fez, precisa deixar?

    @Test
    void testSortArrayLenght(){
        int [] expectedlenght = {1,2,3,4,5,6,7,9,10};
        int [] actuallenght = {1,2,3,4,5,6,7,8,9,10};


        assertEquals( 9,  9, "o tamanho do bubblesort não é igual...");

    }

    @Test
    void testSortArrayEquals(){
        int [] expectedequals = {1,2,3,4,5,6,7,8,9,10};
        int [] actualequals = {10,9,8,7,6,5,4,3,2,1};
        new BubbleSort().sort(expectedequals);
        assertArrayEquals(expectedequals, actualequals, "O conteúdo do bubblesort não é igual");

    }
    //Testando o método do bubblesort
    @Test
    void testSortNull(){
        int [] expectednull = {};
        int [] actualnull = {};
        assertNull(getClass(), "este bubblesort deveria retornar nulo, mas não está...");

    }

    @Test
    void testSortNotSame(){

    }
    
    @Test
    void testSortBig(){

    }
   
    @Test
    void testSortCharacter(){

    }
 
    @Test
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS) //testar com sleep
    void testSortTimeout(){
        assertFalse(false, null);
        assertNotEquals(null, null, null);
        assertNotSame(getClass(), getClass(), null);
        assertNotNull(getClass(), null);
        assertTimeout(null, null, null);
        


    }
    //mandar array vazio
    //mandar array grande
    //mandar array com caractere
    //Teste de timeout @Timeout 


}
