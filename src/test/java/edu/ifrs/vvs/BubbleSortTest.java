package edu.ifrs.vvs;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

/**
 * BubbleSortTest
 */
public class BubbleSortTest {

  private BubbleSort bubbleSort = new BubbleSort();

  @Test
  public void ordenarArrayDeVariosElementos() {
    int[] array = { 5, 2, 8, 1, 6 };
    int[] arrayOrdenado = { 1, 2, 5, 6, 8 };
    bubbleSort.sort(array);
    assertArrayEquals(arrayOrdenado, array);
  }

  @Test
  public void ordenarArrayDeUmElemento() {
    int[] array = { 1 };
    int[] arrayOrdenado = { 1 };
    bubbleSort.sort(array);
    assertArrayEquals(arrayOrdenado, array);
  }

  @Test
  public void ordenarArrayComNegativos() {
    int[] array = { 0, 7, -1, -4 };
    int[] arrayOrdenado = { -4, -1, 0, 7 };
    bubbleSort.sort(array);
    assertArrayEquals(arrayOrdenado, array);
  }

  @Test
  public void ordenarArrayJaOrdenado() {
    int[] array = { 2, 6, 9 };
    int[] arrayOrdenado = { 2, 6, 9 };
    bubbleSort.sort(array);
    assertArrayEquals(arrayOrdenado, array);
  }
}
