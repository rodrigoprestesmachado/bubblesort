package edu.ifrs.vvs;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class BubbleSortTests {
  
  BubbleSort bs = new BubbleSort();

  @Test
  public void assertOrderPositiveNumbers() {
    int input[] = { 32, 4, 6, 90, 79 };
    int expectedOutput[] = { 4, 6, 32, 79, 90 };
    bs.sort(input);
    assertTrue(Arrays.equals(expectedOutput, input));
  }

  @Test
  public void assertOrderNegativeNumbers() {
    int input[] = { -32, -4, -6, -90, -79 };
    int expectedOutput[] = { -90, -79, -32, -6, -4 };
    bs.sort(input);
    assertTrue(Arrays.equals(expectedOutput, input));
  }

}
