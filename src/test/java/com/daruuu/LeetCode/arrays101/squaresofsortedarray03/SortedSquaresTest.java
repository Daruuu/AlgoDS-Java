package com.daruuu.LeetCode.arrays101.squaresofsortedarray03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortedSquaresTest {

    @Test
    void sortedSquares() {
        //  given
        int []inputArray = {-4,-1,0,3,10};
        int []expectedResult = {0,1,9,16,100};
        //  when
        int []  result = SortedSquares.sortedSquares(inputArray);
        //  then
        assertArrayEquals(result, expectedResult);
    }
}