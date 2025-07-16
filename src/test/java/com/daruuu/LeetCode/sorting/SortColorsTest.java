package com.daruuu.LeetCode.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortColorsTest {

    @Test
    void    shouldSortColorsCorrectly_whenUnsortedColorsGiven() {
        int[] nums = {2, 0, 2, 1, 1, 0};
        int[] expected = {0, 0, 1, 1, 2, 2};

        SortColors.sortColors(nums);
        assertArrayEquals(expected, nums);
    }

}