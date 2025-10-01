package com.daruuu.problems.leetcode.easy.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidMountainArrayTest {

    @Test
    void should_validMountainArray_whenReturnTrue() {

        //  Arrange
        int [] inputArr = {0,3,2,1};
        boolean expectedOutput = true;

        // Act
        boolean result = ValidMountainArray.validMountainArray(inputArr);

        //  Assert
        assertEquals(expectedOutput, result);
    }

    @Test
    void should_validMountainArray_whenReturnFalse() {
        //  Arrange

        int [] inputArr = {0,3,2,1};
        boolean expectedOutput = true;

        // Act
        boolean result = ValidMountainArray.validMountainArray(inputArr);

        //  Assert
        assertEquals(expectedOutput, result);
    }
}