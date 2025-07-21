package com.daruuu.LeetCode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    @Test
    void    shouldReturnTwo_whenMoveAllValAtEndOfArray() {
        //  Arrange
        int []  numsInput = {3,2,2,3};
        int val = 3;
        int     expectedOutput = 2;

        //  Act
        int result = RemoveElement_27.removeElementUsingOn2(numsInput, val);

        //  Assert
        assertEquals(expectedOutput, result);
    }

    @Test
    void    shouldReturnFive_whenMoveAllValAtEndOfArray() {
        //  Arrange
        int []  numsInput = {0,1,2,2,3,0,4,2};
        int val = 2;
        int     expectedOutput = 5;

        //  Act
        int result = RemoveElement_27.removeElementUsingOn2(numsInput, val);

        //  Assert
        assertEquals(expectedOutput, result);
    }

    @Test
    void    shouldReturnFive_whenMoveAllValAtEndOfArray_usingOn() {
        //  Arrange
        int []  numsInput = {0,1,2,2,3,0,4,2};
        int val = 2;
        int     expectedOutput = 5;

        //  Act
        int result = RemoveElement_27.removeElementUsingOn(numsInput, val);

        //  Assert
        assertEquals(expectedOutput, result);
    }
}
