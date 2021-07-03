package edu.ifrs.vvs;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for BubbleSortTests class.
 */
public class BubbleSortTests {

    private BubbleSort bs;

    @BeforeEach
    public void setup() {
        bs = new BubbleSort();
    }

    @Test
    @SuppressWarnings("checkstyle:magicnumber")
    @DisplayName("Testando array de números positivos")
    public void assertOrderPositiveNumbers() {
        int[] input = {32, 4, 6, 90, 79};
        int[] expectedOutput = {4, 6, 32, 79, 90};
        bs.sort(input);
        assertTrue(Arrays.equals(expectedOutput, input));
    }

    @Test
    @SuppressWarnings("checkstyle:magicnumber")
    @DisplayName("Testando array de números negativos")
    public void assertOrderNegativeNumbers() {
        int[] input = {-32, -4, -6, -90, -79};
        int[] expectedOutput = {-90, -79, -32, -6, -4};
        bs.sort(input);
        assertTrue(Arrays.equals(expectedOutput, input));
    }

}
