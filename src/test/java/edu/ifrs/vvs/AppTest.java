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

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Unit test for simple App.
 */
class AppTest {

    private BubbleSort bs;
    private BubbleSortCustomStdIn customBs;
    private int[] valoresInformados;

    /**
     * Testa construtor da classe BubbleSort ao criar uma instância dela.
     */
    @Test
    @Order(1)
    void testaConstrutorBubblesort() {
        this.bs = new BubbleSort();
        //Caso o atributo scanner não estiver inicializado corretamente gerará exceção
        assertDoesNotThrow(() -> {
            this.bs.show();
        });
    }

    /**
     * Testa o comportamento se inserido tamanho negativo para o array scanner.
     */
    @Test
    @Order(2)
    void testaTamanhoNegativo() {
        /*
         * Cria adiciona dados ao buffer de entrada para que não seja
         * necessário input de um testador. Primeiro número indica
         * o total de elementos
         */
        String inputUsuario = "-1";
        InputStream mockStream = new ByteArrayInputStream(inputUsuario.getBytes());
        customBs = new BubbleSortCustomStdIn(mockStream);
        assertThrows(NegativeArraySizeException.class, () -> {
            valoresInformados = this.customBs.read();
        });
    }

    /**
     * Testa o comportamento se inserido tamanho nulo para o array scanner.
     */
    @Test
    @Order(3)
    void testaTamanhoZero() {
        /*
         * Cria adiciona dados ao buffer de entrada para que não seja
         * necessário input de um testador. Primeiro número indica
         * o total de elementos
         */
        String inputUsuario = "0";
        InputStream mockStream = new ByteArrayInputStream(inputUsuario.getBytes());
        customBs = new BubbleSortCustomStdIn(mockStream);
        assertDoesNotThrow(() -> {
            valoresInformados = this.customBs.read();
        });
    }

    /**
     * Testa o comportamento se inserido tamanho positivo para o array scanner.
     */
    @Test
    @Order(4)
    void testaTamanhoPositivo() {
        /*
         * Cria adiciona dados ao buffer de entrada para que não seja
         * necessário input de um testador. Primeiro número indica
         * o total de elementos
         */
        String inputUsuario = "3 6 2 4 ";
        InputStream mockStream = new ByteArrayInputStream(inputUsuario.getBytes());
        customBs = new BubbleSortCustomStdIn(mockStream);
        assertDoesNotThrow(() -> {
            valoresInformados = this.customBs.read();
        });
    }

    /**
     * Testa o comportamento se inserido tamanho sendo uma letra.
     */
    @Test
    @Order(5)
    void testaTamanhoInvalidoLetra() {
        /*
         * Cria adiciona dados ao buffer de entrada para que não seja
         * necessário input de um testador. Primeiro número indica
         * o total de elementos
         */
        String inputUsuario = "G 6 2 4 ";
        InputStream mockStream = new ByteArrayInputStream(inputUsuario.getBytes());
        customBs = new BubbleSortCustomStdIn(mockStream);
        assertThrows(NumberFormatException.class, () -> {
            valoresInformados = this.customBs.read();
        });
    }

    /**
     * Testa o comportamento ao ordenar sem haver elementos inseridos.
     */
    @Test
    @Order(6)
    void testaOrdenarSemElementos() {
        testaConstrutorBubblesort();
        assertThrows(NullPointerException.class, () -> {
            bs.sort(this.valoresInformados);
            bs.show(this.valoresInformados);
        });
    }

    /**
     * Testa o comportamento ao ordenar array de 1 elemento.
     */
    @Test
    @Order(7)
    void testaOrdenarUnicoElemento() {
        /*
         * Cria adiciona dados ao buffer de entrada para que não seja
         * necessário input de um testador. Primeiro número indica
         * o total de elementos
         */
        String inputUsuario = "1 7";
        InputStream mockStream = new ByteArrayInputStream(inputUsuario.getBytes());
        customBs = new BubbleSortCustomStdIn(mockStream);
        assertDoesNotThrow(() -> {
            valoresInformados = this.customBs.read();
            customBs.sort(this.valoresInformados);
            customBs.show(this.valoresInformados);
        });
    }

    /**
     * Testa o comportamento ao ordenar array de 2 elementos positivos.
     */
    @Test
    @Order(8)
    void testaOrdenarElementosPositivos() {
        /*
         * Cria adiciona dados ao buffer de entrada para que não seja
         * necessário input de um testador. Primeiro número indica
         * o total de elementos
         */
        String inputUsuario = "2 3 0";
        InputStream mockStream = new ByteArrayInputStream(inputUsuario.getBytes());
        customBs = new BubbleSortCustomStdIn(mockStream);
        assertDoesNotThrow(() -> {
            valoresInformados = this.customBs.read();
            customBs.sort(this.valoresInformados);
            customBs.show(this.valoresInformados);
        });
    }

    /**
     * Testa o comportamento ao ordenar array de 2 elementos negativos.
     */
    @Test
    @Order(9)
    void testaOrdenarElementosNegativos() {
        /*
         * Cria adiciona dados ao buffer de entrada para que não seja
         * necessário input de um testador. Primeiro número indica
         * o total de elementos
         */
        String inputUsuario = "2 -4 -7";
        InputStream mockStream = new ByteArrayInputStream(inputUsuario.getBytes());
        customBs = new BubbleSortCustomStdIn(mockStream);
        assertDoesNotThrow(() -> {
            valoresInformados = this.customBs.read();
            customBs.sort(this.valoresInformados);
            customBs.show(this.valoresInformados);
        });
    }

    /**
     * Testa o comportamento ao ordenar array de 2 elementos, um negativo e outro positivo.
     */
    @Test
    @Order(10)
    void testaOrdenarElementosPositivoNegativo() {
        /*
         * Cria adiciona dados ao buffer de entrada para que não seja
         * necessário input de um testador. Primeiro número indica
         * o total de elementos
         */
        String inputUsuario = "2 100 -1";
        InputStream mockStream = new ByteArrayInputStream(inputUsuario.getBytes());
        customBs = new BubbleSortCustomStdIn(mockStream);
        assertDoesNotThrow(() -> {
            valoresInformados = this.customBs.read();
            customBs.sort(this.valoresInformados);
            customBs.show(this.valoresInformados);
        });
    }

    /**
     * Testa o comportamento ao ordenar array de 2 elementos nulos.
     */
    @Test
    @Order(11)
    void testaOrdenarElementosNulos() {
        /*
         * Cria adiciona dados ao buffer de entrada para que não seja
         * necessário input de um testador. Primeiro número indica
         * o total de elementos
         */
        String inputUsuario = "2 0 0";
        InputStream mockStream = new ByteArrayInputStream(inputUsuario.getBytes());
        customBs = new BubbleSortCustomStdIn(mockStream);
        assertDoesNotThrow(() -> {
            valoresInformados = this.customBs.read();
            customBs.sort(this.valoresInformados);
            customBs.show(this.valoresInformados);
        });
    }

    /**
     * Testa o comportamento ao ordenar array de 2 elementos iguais.
     */
    @Test
    @Order(12)
    void testaOrdenarElementosIguais() {
        /*
         * Cria adiciona dados ao buffer de entrada para que não seja
         * necessário input de um testador. Primeiro número indica
         * o total de elementos
         */
        String inputUsuario = "2 7 7";
        InputStream mockStream = new ByteArrayInputStream(inputUsuario.getBytes());
        customBs = new BubbleSortCustomStdIn(mockStream);
        assertDoesNotThrow(() -> {
            valoresInformados = this.customBs.read();
            customBs.sort(this.valoresInformados);
            customBs.show(this.valoresInformados);
        });
    }

    /**
     * Testa o comportamento ao ordenar array com elemento inválido.
     */
    @Test
    @Order(13)
    void testaOrdenarElementosInvalidos() {
        /*
         * Cria adiciona dados ao buffer de entrada para que não seja
         * necessário input de um testador. Primeiro número indica
         * o total de elementos
         */
        String inputUsuario = "2 A 7";
        InputStream mockStream = new ByteArrayInputStream(inputUsuario.getBytes());
        customBs = new BubbleSortCustomStdIn(mockStream);
        assertThrows(NumberFormatException.class, () -> {
            valoresInformados = this.customBs.read();
            customBs.sort(this.valoresInformados);
            customBs.show(this.valoresInformados);
        });
    }

    /**
     * Testa o comportamento ao ordenar array com elemento inválido sendo double.
     */
    @Test
    @Order(14)
    void testaOrdenarElementosInvalidosDouble() {
        /*
         * Cria adiciona dados ao buffer de entrada para que não seja
         * necessário input de um testador. Primeiro número indica
         * o total de elementos
         */
        String inputUsuario = "2 0.000000000000001 0";
        InputStream mockStream = new ByteArrayInputStream(inputUsuario.getBytes());
        customBs = new BubbleSortCustomStdIn(mockStream);
        assertThrows(NumberFormatException.class, () -> {
            valoresInformados = this.customBs.read();
            customBs.sort(this.valoresInformados);
            customBs.show(this.valoresInformados);
        });
    }

    /**
     * Testa o comportamento ao ordenar array com elemento fora do limite int.
     */
    @Test
    @Order(15)
    void testaOrdenarElementosForaDoLimite() {
        /*
         * Cria adiciona dados ao buffer de entrada para que não seja
         * necessário input de um testador. Primeiro número indica
         * o total de elementos
         */
        String inputUsuario = "2 -2147483649 2147483648";
        InputStream mockStream = new ByteArrayInputStream(inputUsuario.getBytes());
        customBs = new BubbleSortCustomStdIn(mockStream);
        assertThrows(NumberFormatException.class, () -> {
            valoresInformados = this.customBs.read();
            customBs.sort(this.valoresInformados);
            customBs.show(this.valoresInformados);
        });
    }

    /**
     * Testa o comportamento ao ordenar array com elementos no limite Int.
     */
    @Test
    @Order(16)
    void testaOrdenarElementosNoLimite() {
        /*
         * Cria adiciona dados ao buffer de entrada para que não seja
         * necessário input de um testador. Primeiro número indica
         * o total de elementos
         */
        String inputUsuario = "2 2147483647 -2147483648";
        InputStream mockStream = new ByteArrayInputStream(inputUsuario.getBytes());
        customBs = new BubbleSortCustomStdIn(mockStream);
        assertDoesNotThrow(() -> {
            valoresInformados = this.customBs.read();
            customBs.sort(this.valoresInformados);
            customBs.show(this.valoresInformados);
        });
    }
}
