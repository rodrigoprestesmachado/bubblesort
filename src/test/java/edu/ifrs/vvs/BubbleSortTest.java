package edu.ifrs.vvs;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {

  BubbleSort bubbleSort = new BubbleSort();
  int[] values = {3, 2, 1};

  @Test
  @DisplayName("Certo: array igual e na ordem")
  public void bubbleSortTestRight() {
    bubbleSort.sort(values);
    assertArrayEquals(new int[]{1, 2, 3}, values);
  }

  @Test
  @DisplayName("Errado: array com um elemento a mais")
  public void bubbleSortTestWrong1() {
    assertFalse(Arrays.equals(new int[]{1, 2, 3, 4}, values));
  }

  @Test
  @DisplayName("Errado: array desordenada")
  public void bubbleSortTestWrong2() {
    assertFalse(Arrays.equals(new int[]{3, 1, 2}, values));
  }
}
