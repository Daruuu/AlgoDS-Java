package com.daruuu.LeetCode.beginnerchallengeproblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RunningSumOfOneDArray01Test {

    @Test
    void    shouldReturnNewArrayWithSumOfEachPositionBeforeIndex_whenArrayExists() {
        //  given
        int []  numsInput  = {1,2,3,4};
        int []  expectedOutput = {1,3,6,10};

        //  when
        int[]   result = RunningSumOfOneDArray01.runningSum(numsInput);

        //  then
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    void    shouldReturnNewArrayEmpty_whenArrayIsNull() {
        //  given
        int []  numsInput  = null;
        int []  expectedOutput = new int[] {};

        //  when
        int[]   result = RunningSumOfOneDArray01.runningSum(numsInput);

        //  then
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    void shouldReturnSameArray_whenArrayHasOneElement() {
        int[] numsInput = {5};
        int[] expectedOutput = {5};
        assertArrayEquals(expectedOutput, RunningSumOfOneDArray01.runningSum(numsInput));
    }

    @Test
    void shouldReturnZeros_whenAllElementsAreZero() {
        int[] numsInput = {0, 0, 0, 0};
        int[] expectedOutput = {0, 0, 0, 0};
        assertArrayEquals(expectedOutput, RunningSumOfOneDArray01.runningSum(numsInput));
    }

    @Test
    void shouldReturnCorrectRunningSum_whenArrayContainsNegativeNumbers() {
        int[] numsInput = {-1, 2, -3, 4};
        int[] expectedOutput = {-1, 1, -2, 2};
        assertArrayEquals(expectedOutput, RunningSumOfOneDArray01.runningSum(numsInput));
    }

    @Test
    void shouldReturnEmptyArray_whenInputIsEmpty() {
        int[] numsInput = {};
        int[] expectedOutput = {};
        assertArrayEquals(expectedOutput, RunningSumOfOneDArray01.runningSum(numsInput));
    }


}