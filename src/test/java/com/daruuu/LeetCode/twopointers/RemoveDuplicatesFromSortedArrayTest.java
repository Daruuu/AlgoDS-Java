package com.daruuu.LeetCode.twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {

    @Test
    void shouldReturnFive_whenInArrayOfIntegersNonDuplicatesIsFive() {
        //  Arrange

        int[] numsInput = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int expectedOutput = 5;

        //  Act
        int result = RemoveDuplicatesFromSortedArray.removeDuplicates(numsInput);

        //  Assert
        assertEquals(expectedOutput, result);
    }

    @Test
    void shouldReturnTwo_whenInArrayOfIntegersNonDuplicatesIsTwo() {
        //  Arrange

        int[] numsInput = {1, 2, 2};
        int expectedOutput = 2;

        //  Act
        int result = RemoveDuplicatesFromSortedArray.removeDuplicates(numsInput);

        //  Assert
        assertEquals(expectedOutput, result);
    }
}