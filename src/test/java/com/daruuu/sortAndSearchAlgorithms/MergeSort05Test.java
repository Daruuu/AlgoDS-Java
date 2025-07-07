package com.daruuu.sortAndSearchAlgorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSort05Test {

    @Test
    void    shouldReturnSortArray_whenArrayExists() {

        //  given
        int[]   nums = {5, 2, 9, 1, 6};
        int[]   expectedResult = {1, 2, 5, 6, 9};

        //  when
        int []  result = MergeSort05.sortArrayUsingMergeSort(nums);

        //  then
        assertArrayEquals(expectedResult, result);
    }
}