package edu.ifrs.vvs;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class TestBubbleSort {

    private static final int[] INT_VAZIO = {};
    private static final int[] INT_NULL = null;
    private static final int[] INT_POS_ORD = { 0, 1, 5, 9 };
    private static final int[] INT_POS_DESORD = { 9, 0, 1, 5 };
    private static final int[] INT_NEG_ORD = { -12, -7, -1, 0 };
    private static final int[] INT_NEG_DESORD = { -7, -12, 0, -1 };
    private static final int[] INT_GRANDE_DESORD = { 987987987, 15, 0, 1, -1, -83748332 };
    private static final int[] INT_GRANDE_ORD = { -83748332, -1, 0, 1, 15, 987987987 };

    // private static final String[] STR_POS_DESORD = { "Figo", "Abacaxi", "Caju",
    // "Bergamota", "Damasco", "Escropari" };

    BubbleSort bubbleSortTeste = new BubbleSort();
    AppTest appTest = new AppTest();

    @Before
    public void init() {
        bubbleSortTeste.read();
    }

    // Exemplo em: https://www.java2novice.com/junit-examples/assert-array-equals/ -
    // acessado em: 07-11-2021
    @Test
    void sortEmptyDataInt() {
        int[] arrayIntVazio = INT_VAZIO;
        bubbleSortTeste.sort(arrayIntVazio);
        assertNotEquals(INT_POS_ORD, arrayIntVazio, "Vetor vazio.");
    }

    @Test
    void sortNulo() {
        int[] arrayIntVazio = INT_NULL;
        // bubbleSortTeste.sort(arrayIntVazio);
        assertThrows(NullPointerException.class, () -> bubbleSortTeste.sort(arrayIntVazio), "Vetor nulo.");
    }

    @Test
    void testeOrdenacaoNumPositivo() {
        int[] arrayIntCheioDesordenado = INT_POS_DESORD;
        int[] arrayIntCheioOrdenado = INT_POS_ORD;
        bubbleSortTeste.sort(arrayIntCheioDesordenado);
        assertArrayEquals(arrayIntCheioOrdenado, arrayIntCheioDesordenado);
    }

    @Test
    void testeOrdenacaoNumNegativo() {
        int[] arrayIntCheioDesordenado = INT_NEG_DESORD;
        int[] arrayIntCheioOrdenado = INT_NEG_ORD;
        bubbleSortTeste.sort(arrayIntCheioDesordenado);
        assertArrayEquals(arrayIntCheioOrdenado, arrayIntCheioDesordenado);
    }

    @Test
    void testeOrdenacaoNumGrande() {
        int[] arrayIntCheioDesordenado = INT_GRANDE_DESORD;
        int[] arrayIntCheioOrdenado = INT_GRANDE_ORD;
        bubbleSortTeste.sort(arrayIntCheioDesordenado);
        assertArrayEquals(arrayIntCheioOrdenado, arrayIntCheioDesordenado);
    }

    // @Test
    // void sortEmptyDataString() {
    // String[] arrayStringVazio = {};
    // String[] arrayStringCheio = { "1", "2" };
    // assertArrayEquals(Integer.parseInt(arrayStringCheio), arrayStringVazio,
    // "Arrays should be equal");
    // }

    // @Test
    // void read() {
    // int[] arrayIntCheioDesordenado = INT_POS_DESORD;
    // bubbleSortTeste.read();
    // }

    // @Test
    // void size() {
    // bubbleSortTeste.sort(INT_POS_DESORD);
    // bubbleSortTeste.read();
    // int retornoSize = bubbleSortTeste.size();
    // assertTrue(retornoSize, retornoSize);
    // }

    @Test
    void show() {
        bubbleSortTeste.show(INT_POS_DESORD);
    }

    // Pesquisado em: https://www.baeldung.com/junit-assertions
    // @AfterEach
    @Test
    void quandoTesteFalha() {
        // Teste não completo
        fail("Falha - Teste não completado.");
    }
}