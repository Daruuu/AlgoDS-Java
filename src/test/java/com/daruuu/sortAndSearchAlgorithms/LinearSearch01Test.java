package com.daruuu.sortAndSearchAlgorithms;

import com.daruuu.algorithms.searching.LinearSearch;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LinearSearch01Test {

    @Test
    void shouldReturnANumber_whenfindFirstOccurrenceInArrayList() {
        //  given
        List<Integer>   arrayInput = Arrays.asList(4, 2, 7, 1, 7, 3);
        int targetInput = 7;
        int foundFirstOccurrence;
        int expectedOutput = 2;

        //  when
        foundFirstOccurrence = LinearSearch.findFirstOccurrenceInList(arrayInput, targetInput);

        //  then
        assertEquals(expectedOutput, foundFirstOccurrence);
    }

    @Test
    void    shouldReturnMinusOne_whenTargetAreNotInArray() {
        //  given
        List<Integer>   arrayInput = Arrays.asList(4, 2, 7, 1, 7, 3);
        int targetInput = 0;
        int expectedOutput = -1;

        //  when
        int result = LinearSearch.findFirstOccurrenceInList(arrayInput, targetInput);

        //  then
        assertEquals(expectedOutput, result);
    }

    @Test
    void    shouldReturnCorrectIndex_whenArrayContainsIntegerMinValue() {

        //  given
        List<Integer>   arrayInput = Arrays.asList(4, 2, 7, 1, 7, 3, Integer.MIN_VALUE);
        int targetInput = Integer.MIN_VALUE;
        int result;
        int expectedOutput = arrayInput.size() - 1;

        //  when
        result = LinearSearch.findFirstOccurrenceInList(arrayInput, (int) targetInput);

        //  then
        assertEquals(expectedOutput, result);
    }

    @Test
    void    shouldReturnMinusOne_whenArrayIsEmpty() {

        //  given
        List<Integer>   arrayInput = Collections.emptyList();
        int targetInput = 7;
        int expectedOutput = -1;

        //  when
        int result = LinearSearch.findFirstOccurrenceInList(arrayInput, targetInput);

        //  then
        assertEquals(expectedOutput, result);
    }

    @Test
    void    shouldReturnZero_whenTargetInOnlyOneElement() {

        //  given
        List<Integer>   arrayInput = Collections.singletonList(7);
        int targetInput = 7;
        int expectedOutput = 0;

        //  when
        int result = LinearSearch.findFirstOccurrenceInList(arrayInput, targetInput);

        //  then
        assertEquals(expectedOutput, result);
    }
}