package com.daruuu.LeetCode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuildArrayFromPermutationTest {

    @Test
    void    shouldReturnANewArrayWithPermutations_whenArrayExists() {

        //  Arrange
        int []   numsInput = {0,2,1,5,3,4};
        int []   expectedResult = {0,1,2,4,5,3};

        //  Act
        int []   result = BuildArrayFromPermutation.buildArray(numsInput);

        //  Assert
        assertArrayEquals(expectedResult, result);
    }
}