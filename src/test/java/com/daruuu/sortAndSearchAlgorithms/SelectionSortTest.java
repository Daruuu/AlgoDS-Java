package com.daruuu.sortAndSearchAlgorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    @Test
    void    shouldReturnAscendingListSorted_whenInputIsCorrect() {
        //  given
        int[]   nums = {29, 10, 14, 37, 13};
        int[]   expectedOutput = {10, 13, 14, 29, 37};

        //  when
        int[] resultArray = SelectionSort.sortArrayAscendingUsingSelectionSort(nums);

        //  then
        assertArrayEquals(expectedOutput, resultArray);
    }

    @Test
    void    shouldReturnNull_whenArrayIsNull() {
        //  given
        int[]   nums = null;
        int[]   expectedOutput = null;

        //  when
        int[] resultArray = SelectionSort.sortArrayAscendingUsingSelectionSort(nums);

        //  then
        assertArrayEquals(expectedOutput, resultArray);
    }
}