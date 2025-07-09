package com.daruuu.LeetCode.greedyalgorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalidromeTest {

    @Test
    void    shouldReturnValidPalindrome_whenStringExists() {
        String  s = "abccccdd";
        int     expectedOutput = 7;

        int result = LongestPalidrome.longestPalindrome(s);

        assertEquals(expectedOutput, result);

    }
}