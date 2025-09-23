package com.daruuu.problems.leetcode.easy.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    @Test

    void should_returnTwoAndModifyArray_whenRemovingValueThreeWithTwoOccurrences() {
        // Arrange

        int[] numsInput = {3, 2, 1, 3};
        int valToRemove= 3;

        int expectedLength = 2;
        int[] expectedNums = {2, 1};

        // Act
        int resultLength = RemoveElement.removeElement(numsInput, valToRemove);

        //  Assert
        assertEquals(expectedLength, resultLength);

        for (int i = 0; i < expectedLength; i++)
        {
            assertEquals(expectedNums[i], numsInput[i]);
        }
    }

    @Test
    void    should_returnZero_whenAllElementsAreRemoved() {
        //  Arrange
        int  [] numsInput = {3, 3, 3};
        int valToRemove = numsInput[0];

        //  Act
        int resultLength = RemoveElement.removeElement(numsInput, valToRemove);

        //  Assert
        assertEquals(0, resultLength);
    }

    @Test
    void    should_returnArray_whenNoElementMatch() {
        //  Arrange
        int  [] numsInput = {1, 2, 0, 4 };
        int valToRemove = 8;
        int expectLength = numsInput.length;

        //  Act
        int resultLength = RemoveElement.removeElement(numsInput, valToRemove);

        //  Assert
        assertEquals(expectLength, resultLength);
        assertArrayEquals(new int[]{1, 2, 0, 4}, Arrays.copyOf(numsInput, resultLength));

    }
}