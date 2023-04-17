package edu.ifrs.vvs;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class BubbleSortTest {

  @Test
  public void testSort() {
    int[] input = { 5, 3, 8, 6, 7, 2 };
    int[] expectedOutput = { 2, 3, 5, 6, 7, 8 };
    BubbleSort bubbleSort = new BubbleSort();
    bubbleSort.sort(input);
    assertArrayEquals(expectedOutput, input);
  }

  @Test
  public void testEmptyArray() {
    int[] input = {};
    int[] expectedOutput = {};
    BubbleSort bubbleSort = new BubbleSort();
    bubbleSort.sort(input);
    assertArrayEquals(expectedOutput, input);
  }

  @Test
  public void testAlreadySorted() {
    int[] input = { 1, 2, 3, 4, 5 };
    int[] expectedOutput = { 1, 2, 3, 4, 5 };
    BubbleSort bubbleSort = new BubbleSort();
    bubbleSort.sort(input);
    assertArrayEquals(expectedOutput, input);
  }

  @Test
  public void testSingleElement() {
    int[] input = { 5 };
    int[] expectedOutput = { 5 };
    BubbleSort bubbleSort = new BubbleSort();
    bubbleSort.sort(input);
    assertArrayEquals(expectedOutput, input);
  }

  @Test
  public void testTwoElements() {
    int[] input = { 5, 3 };
    int[] expectedOutput = { 3, 5 };
    BubbleSort bubbleSort = new BubbleSort();
    bubbleSort.sort(input);
    assertArrayEquals(expectedOutput, input);
  }

  @Test
  public void testDuplicateElements() {
    int[] input = { 5, 3, 8, 6, 7, 2, 5, 6, 7, 8 };
    int[] expectedOutput = { 2, 3, 5, 5, 6, 6, 7, 7, 8, 8 };
    BubbleSort bubbleSort = new BubbleSort();
    bubbleSort.sort(input);
    assertArrayEquals(expectedOutput, input);
  }

  @Test
  public void testNegativeElements() {
    int[] input = { 5, -3, 8, -6, 7, 2 };
    int[] expectedOutput = { -6, -3, 2, 5, 7, 8 };
    BubbleSort bubbleSort = new BubbleSort();
    bubbleSort.sort(input);
    assertArrayEquals(expectedOutput, input);
  }

  @Test
  public void testLargeArray() {
    int[] input = new int[1000];
    for (int i = 0; i < input.length; i++) {
      input[i] = (int) (Math.random() * 1000);
    }
    int[] expectedOutput = input.clone();
    Arrays.sort(expectedOutput);
    BubbleSort bubbleSort = new BubbleSort();
    bubbleSort.sort(input);
    assertArrayEquals(expectedOutput, input);
  }
}
