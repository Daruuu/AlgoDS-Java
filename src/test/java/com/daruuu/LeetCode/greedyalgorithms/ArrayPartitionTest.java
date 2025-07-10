package com.daruuu.LeetCode.greedyalgorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayPartitionTest {

    @Test
    void    shouldReturnValidNum_whenInputIsValid() {
        int[] nums = {1,4,3,2};
        int expextedOutput= 4;
//        1. (1, 4), (2, 3) -> min(1, 4) + min(2, 3) = 1 + 2 = 3
//        2. (1, 3), (2, 4) -> min(1, 3) + min(2, 4) = 1 + 2 = 3
//        3. (1, 2), (3, 4) -> min(1, 2) + min(3, 4) = 1 + 3 = 4
        int result = ArrayPartition.arrayPairSum(nums);

        assertEquals(expextedOutput, result);
    }

    @Test
    void    shouldReturnValidNum_whenInputIsValid2() {
        int[] nums = {6,2,6,5,1,2};
        int expextedOutput= 9;

        int result = ArrayPartition.arrayPairSum(nums);

        assertEquals(expextedOutput, result);
    }
}