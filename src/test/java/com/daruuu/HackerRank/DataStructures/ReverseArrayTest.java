package com.daruuu.HackerRank.DataStructures;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReverseArrayTest {

    @Test
    void    shouldReturnReversedArray_whenInputHasFourNumbers() {

/*
        List<Integer> arrayInput = new ArrayList<>();
        arrayInput.add(1);
        arrayInput.add(4);
        arrayInput.add(3);
        arrayInput.add(2);
*/
        //  Given
        List<Integer> arrayInput = Arrays.asList(1, 4, 3, 2);
        List<Integer> expectedResult = Arrays.asList(2, 3, 4, 1);

        List<Integer> resultArray = new ArrayList<>();

        //  When

        resultArray = ReverseArray.reverseArray(arrayInput);

        //  Then
        assertEquals(expectedResult, resultArray);
    }
}