package com.daruuu.LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void    shouldReturnArrayWithTwoNumber_whenResultOfTwoNumbersIsTheTarget() {

        int []  nums = {2,7,11,15};
        int     target = 9;
        int[]   expectedOutput = {0,1};
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        int []  result = TwoSum.twoSum(nums, target);

        assertArrayEquals(expectedOutput, result);
    }

    @Test
    void    shouldReturnOneAndTwo_whenResultOfIndexIsTheTarget() {

        int []  nums = {3, 2, 4};
        int     target = 6;
        int[]   expectedOutput = {1,2};
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        int []  result = TwoSum.twoSum(nums, target);

        assertArrayEquals(expectedOutput, result);
    }
}