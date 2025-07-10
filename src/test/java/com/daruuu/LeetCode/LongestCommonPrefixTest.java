package com.daruuu.LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    @Test
    void    shouldReturnPrefixOfTwo_whenInputValid() {

        String[] strs = {"flower","flow","flight"};
        String  expectedOutput = "fl";

        String  result = LongestCommonPrefix.longestCommonPrefix(strs);

        assertEquals(expectedOutput, result);
    }

    @Test
    void    shouldReturnPrefixOfTwo_whenInputValid2() {
        String[]    strs = {"dog","racecar","car"};
        String  expectedOutput = "";

        String  result = LongestCommonPrefix.longestCommonPrefix(strs);

        assertEquals(expectedOutput, result);
    }
}