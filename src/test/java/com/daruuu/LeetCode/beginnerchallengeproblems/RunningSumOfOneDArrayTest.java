package com.daruuu.LeetCode.beginnerchallengeproblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RunningSumOfOneDArrayTest {

//        Input: nums = [1,2,3,4]
//        Output: [1,3,6,10]
//        Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
    @Test
    void    shouldReturnNewArrayWithSumOfEachPositionBeforeIndex_whenArrayExists() {
        //  given
        int []  numsInput  = {1,2,3,4};
        int []  expectedOutput = {1,3,6,10};

        //  when
        int[]   result = RunningSumOfOneDArray.runningSum(numsInput);

        //  then
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    void    shouldReturnNewArrayEmpty_whenArrayIsNull() {
        //  given
        int []  numsInput  = null;
        int []  expectedOutput = new int[] {};

        //  when
        int[]   result = RunningSumOfOneDArray.runningSum(numsInput);

        //  then
        assertArrayEquals(expectedOutput, result);
    }
}