package com.daruuu.sortAndSearchAlgorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSort04Test {

    @Test
    void    shouldReturnSortedArray_whenArrayExists() {
        //  given
        int []  inputArray = {8, 4, 2, 9, 1};
        int []  expectedOutput = {1, 2, 4, 8, 9};

        //  when
        int []  result = InsertionSort04.sortArrayUsingInsertionSort(inputArray);

        //  then
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    void    shouldReturnNullArray_whenArrayIsNull() {
        //  given
        int []  inputArray = null;//{8, 4, 2, 9, 1};
        int []  expectedOutput = null;//{1, 2, 4, 8, 9};

        //  when
        int []  result = InsertionSort04.sortArrayUsingInsertionSort(inputArray);

        //  then
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    void    shouldReturnArraySorted_whenArrayHasDuplicateValue() {
        //  given
        int []  inputArray = {8, 4, 2, 9, 1, 4};
        int []  expectedOutput = {1, 2, 4, 4, 8, 9};

        //  when
        int []  result = InsertionSort04.sortArrayUsingInsertionSort(inputArray);

        //  then
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    void    shouldReturnOneValue_whenArrayHasOnlyOneValue() {
        //  given
        int []  inputArray = {8};
        int []  expectedOutput = {8};

        //  when
        int []  result = InsertionSort04.sortArrayUsingInsertionSort(inputArray);

        //  then
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    void    shouldReturnNull_whenArrayIsEmpty() {
        //  given
        int []  inputArray = {};
        int []  expectedOutput = null;

        //  when
        int []  result = InsertionSort04.sortArrayUsingInsertionSort(inputArray);

        //  then
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    void    shouldReturnSortArray_whenArrayIsSortInvert() {
        //  given
        int []  inputArray = {7, 5, 4, 3, 2, 1, 0};
        int []  expectedOutput = {0, 1, 2, 3, 4, 5, 7};

        //  when
        int []  result = InsertionSort04.sortArrayUsingInsertionSort(inputArray);

        //  then
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    void    shouldReturnSortArray_whenHasPositiveAndNegativesNumbers() {
        //  given
        int []  inputArray = {7, -5, 4, 30, -2, -110};
        int []  expectedOutput = {-110, -5, -2, 4, 7, 30};

        //  when
        int []  result = InsertionSort04.sortArrayUsingInsertionSort(inputArray);

        //  then
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    void    shouldReturnSameArray_whenAllNumsInArrayAreEqual() {
        //  given
        int []  inputArray = {5, 5, 5, 5, 5, 5};
        int []  expectedOutput = {5, 5, 5, 5, 5, 5};

        //  when
        int []  result = InsertionSort04.sortArrayUsingInsertionSort(inputArray);

        //  then
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    void    shouldReturnSameArray_whenArrayAreSort() {
        //  given
        int []  inputArray = {-100, 1, 2, 3, 4, 5};
        int []  expectedOutput = {-100, 1, 2, 3, 4, 5};

        //  when
        int []  result = InsertionSort04.sortArrayUsingInsertionSort(inputArray);

        //  then
        assertArrayEquals(expectedOutput, result);
    }
}