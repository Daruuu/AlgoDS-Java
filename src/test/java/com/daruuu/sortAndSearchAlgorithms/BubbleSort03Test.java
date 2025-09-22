package com.daruuu.sortAndSearchAlgorithms;

import com.daruuu.algorithms.sorting.BubbleSort;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSort03Test {

    @ParameterizedTest  //  permite ejecutar el mismo test con múltiples entradas.
    @MethodSource("provideArraysForSorting")
    void shouldSortArrayCorrectly(int[] input, int[] expected) {
        int[] result = BubbleSort.sortArrayUsingBubbleSortAlgorithm(input);
        assertArrayEquals(expected, result);
    }

    static Stream<Arguments> provideArraysForSorting() {
        return Stream.of(
                Arguments.of(new int[]{5, 3, 8, 4, 2}, new int[]{2, 3, 4, 5, 8}),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5}),
                Arguments.of(new int[]{5, 4, 3, 2, 1}, new int[]{1, 2, 3, 4, 5}),
                Arguments.of(new int[]{3, 1, 2, 2, 3}, new int[]{1, 2, 2, 3, 3}),
                Arguments.of(new int[]{42}, new int[]{42}),
                Arguments.of(new int[]{}, new int[]{})
        );
    }

    @Test
    void    shouldReturnSortedArray_whenArrayIsValid() {

        //  given
        int []  arrayInput = {5, 3, 8, 4, 2};
        int []  expectedOutput = {2, 3, 4, 5, 8};
        int []  result;

        //  when
        result = BubbleSort.sortArrayUsingBubbleSortAlgorithm(arrayInput);

        //  then
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    void    shouldReturnSameArray_whenAlreadySorted() {

        //  given
        int []  arrayInput = {1, 2, 3, 4, 5};
        int []  expectedOutput = {1, 2, 3, 4, 5};
        int []  result;

        //  when
        result = BubbleSort.sortArrayUsingBubbleSortAlgorithm(arrayInput);

        //  then
        assertArrayEquals(expectedOutput, result);

    }

    @Test
    void shouldReturnSortedArray_whenReverseSorted() {

        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, BubbleSort.sortArrayUsingBubbleSortAlgorithm(input));
    }

    @Test
    void shouldHandleDuplicateValues() {
        int[] input = {3, 1, 2, 2, 3};
        int[] expected = {1, 2, 2, 3, 3};
        assertArrayEquals(expected, BubbleSort.sortArrayUsingBubbleSortAlgorithm(input));
    }
}