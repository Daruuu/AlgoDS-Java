package com.daruuu.LeetCode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcatenationOfArrayTest {

    @Test
    void    getConcatenation() {
        //  Arrange
        int[] numsInput = {1,2,1};
        int[] expectedOutput = {1,2,1,1,2,1};

        //  Act
        int []  result = ConcatenationOfArray.getConcatenation(numsInput);

        //  Assert
        assertArrayEquals(expectedOutput, result);
    }
}