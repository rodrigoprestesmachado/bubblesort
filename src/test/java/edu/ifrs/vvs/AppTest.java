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

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */


    @Test
    @DisplayName("Valores positivos")
    void testValoresPositivos(){

        BubbleSort bs = new BubbleSort();

        int[] valores = new int[3];

        valores[0] = 1;
        valores[1] = 9;
        valores[2] = 4;

        bs.sort(valores);

        assertEquals(valores[0], 1  );
        assertEquals(valores[1], 4  );
        assertEquals(valores[2], 9  );
    }

    @Test
    @DisplayName("Valores negativos e iguais")
    void testeValoresNegativosEIguais(){

        BubbleSort bs = new BubbleSort();

        int[] valores = new int[7];

        valores[0] = -1;
        valores[1] = -981;
        valores[2] = -3;
        valores[3] = -9281739;
        valores[4] = -9281738;
        valores[5] = -1;
        valores[6] = -1;

        bs.sort(valores);

        assertEquals(valores[0], -9281739  );
        assertEquals(valores[1], -9281738  );
        assertEquals(valores[2], -981  );
        assertEquals(valores[3], -3  );
        assertEquals(valores[4], -1  );
        assertEquals(valores[5], -1 );
        assertEquals(valores[6], -1 );


    }

    @Test
    @DisplayName("Valores negativos, iguais e zero")
    void testeValoresNegativosIguaisEZero(){


        BubbleSort bs = new BubbleSort();

        int[] valores = new int[9];

        valores[0] = -1;
        valores[1] = -981;
        valores[2] = -3;
        valores[3] = 0;
        valores[4] = -9281738;
        valores[5] = -1;
        valores[6] = -1;
        valores[7] = 9875555;
        valores[8] = 9875551;


        bs.sort(valores);

        assertEquals(valores[0], -9281738  );
        assertEquals(valores[1], -981  );
        assertEquals(valores[2], -3  );
        assertEquals(valores[3], -1  );
        assertEquals(valores[4], -1 );
        assertEquals(valores[5], -1 );
        assertEquals(valores[6], 0  );
        assertEquals(valores[7], 9875551  );
        assertEquals(valores[8], 9875555  );

    }
}
