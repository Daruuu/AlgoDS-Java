package com.daruuu.problems.leetcode.easy.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {

    @Test
    void    shouldReturn_mergeAscendingOrder() {
        // given
        int []  nums1 = {1,2,3,0,0,0};
        int m = 3;

        int []  nums2 = {2,5,6};
        int n = 3;

        int[]   expectedOutput = {1,2,2,3,5,6};

        //  when
        MergeSortedArray.merge(nums1, m, nums2, n);

        //  then
        assertArrayEquals(expectedOutput, nums1);

    }
}