package com.daruuu.sortAndSearchAlgorithms;

import com.daruuu.algorithms.sorting.MergeSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSort05Test {

    @Test
    void    shouldReturnSortArray_whenArrayExists() {

        //  given
        int[]   nums = {5, 2, 9, 1, 6};
        int[]   expectedResult = {1, 2, 5, 6, 9};

        //  when
        int []  result = MergeSort.sortArrayUsingMergeSort(nums);

        //  then
        assertArrayEquals(expectedResult, result);
    }
}