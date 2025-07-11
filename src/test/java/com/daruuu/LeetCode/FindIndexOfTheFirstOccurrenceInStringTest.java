package com.daruuu.LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindIndexOfTheFirstOccurrenceInStringTest {

    @Test
    void    shouldReturnMinusOne_whenNeedleNotExistsInHaystack() {
        String  haystack = "leetcode";
        String  needle = "leeto";
        int expectedOutput = -1;

        int result = FindIndexOfTheFirstOccurrenceInString.strstr(haystack, needle);

        assertEquals(expectedOutput, result);
    }
}