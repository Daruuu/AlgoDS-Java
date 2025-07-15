package com.daruuu.LeetCode;

import com.daruuu.LeetCode.array.LongestCommonPrefix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    @Test
    void    shouldReturnFl_whenStringHaveCommonPrefixFlowerFlowFlight() {

        String[] strs = {"flower","flow","flight"};
        String  expectedOutput = "fl";

        String  result = LongestCommonPrefix.longestCommonPrefix(strs);

        assertEquals(expectedOutput, result);
    }

    @Test
    void    shouldReturnEmptyString_whenNoCommonPrefixExists() {
        String[]    strs = {"dog","racecar","car"};
        String      expectedOutput = "";

        String  result = LongestCommonPrefix.longestCommonPrefix(strs);

        assertEquals(expectedOutput, result);
    }

    @Test
    void shouldReturnEntireString_whenAllStringsAreIdentical() {
        String[] strs = {"java", "java", "java"};
        String expected = "java";

        String result = LongestCommonPrefix.longestCommonPrefix(strs);

        assertEquals(expected, result);
    }

}