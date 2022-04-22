package edu.ifrs.vvs;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {

    BubbleSort bs = new BubbleSort();
    

    int[] ar = {2,3,1,4};
    int[] art = {1,2,3,4};
    int[] art2 = {2,2,2,2};

    @Test
    @Order(1)
    public void ordenaArray()
        {
            assertArrayEquals(art, bs.sort(ar));
                }

/*
    // ABAIXO AS TENTATIVAS DE TESTE DOS DEMAIS METODOS
    @Test
    @Order(3)
    public void tamanhoArray()
        {
            //assertArrayEquals(4, bs.size(ar));
                }
    @Test
    @Order(1)
    public void montaArray()
        {
            //assertArrayEquals(art, bs.read(), ar);
                }

    @Test
    @Order(1)
    public void leArray()
        {
            //assertArrayEquals(art, bs.read(), ar);
                }

    @Test
    @Order(1)
    public void bteste()
        {
            assertArrayEquals(bs.show() , bs.sort(bs.read()));
                }
*/

}
