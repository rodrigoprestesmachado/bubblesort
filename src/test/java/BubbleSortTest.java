import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import edu.ifrs.vvs.BubbleSort;

public class BubbleSortTest {

    private BubbleSort bubbleSort = new BubbleSort();

    //notação test pra indicar o método
    //zero elementos
    @Test
    public void nadaComNenhum() {
        int[] valores = {};
        bubbleSort.sort(valores);
    }

    //um elemento
    @Test
    public void nadaComUm(){
        int[] valores = {2};

        bubbleSort.sort(valores);
        assertArrayEquals(new int[] {2}, valores);

    }

    @Test
    public void sortValores(){
        int[] valores = {0, 200, -3, 14, 100};
        int[] ordemEsperada = {-3, 0, 14, 100, 200};

        bubbleSort.sort(valores);
        assertArrayEquals(ordemEsperada, valores);
    }

}

//ao concluir, ir para o erlenmeyer (extensão de teste)