package com.daruuu.LeetCode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HowManyNumbersAreSmallerThanTheCurrentNumberTest {

    @Test
    void    smallerNumbersThanCurrent() {
        //  Arrange
        int []  numsInput  = {8,1,2,2,3};
        int []  expectedOutput = {4,0,1,1,3};

        //  Act
        int []  result = HowManyNumbersAreSmallerThanTheCurrentNumber.smallerNumbersThanCurrent(numsInput);

        //  Assert
        assertArrayEquals(expectedOutput, result);
    }


    @Test
    void shouldReturnZeros_whenAllElementsAreEqual() {
        int[] input = {7, 7, 7, 7};
        int[] expected = {0, 0, 0, 0};
        assertArrayEquals(expected, HowManyNumbersAreSmallerThanTheCurrentNumber.smallerNumbersThanCurrent(input));
    }

    @Test
    void shouldReturnAscendingIndices_whenArrayIsStrictlyIncreasing() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {0, 1, 2, 3};
        assertArrayEquals(expected, HowManyNumbersAreSmallerThanTheCurrentNumber.smallerNumbersThanCurrent(input));
    }

    @Test
    void shouldReturnDescendingIndices_whenArrayIsStrictlyDecreasing() {
        int[] input = {4, 3, 2, 1};
        int[] expected = {3, 2, 1, 0};
        assertArrayEquals(expected, HowManyNumbersAreSmallerThanTheCurrentNumber.smallerNumbersThanCurrent(input));
    }

}