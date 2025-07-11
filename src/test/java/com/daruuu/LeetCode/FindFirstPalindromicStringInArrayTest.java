package com.daruuu.LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindFirstPalindromicStringInArrayTest {

    @Test
    void    shouldReturnThirdWordOfArray_whenIsPalindrome() {

        String[]    words = {"abc","car","ada","racecar","cool"};
        String      expectedOutput = "ada";

        String  result = FindFirstPalindromicStringInArray.firstPalindrome(words);

        assertEquals(expectedOutput, result);
    }

    @Test
    void    shouldReturnAda_whenIsPalindrome() {

        String[]    words = {"notapalindrome","racecar"};
        String      expectedOutput = "racecar";

        String  result = FindFirstPalindromicStringInArray.firstPalindrome(words);

        assertEquals(expectedOutput, result);
    }

    @Test
    void    shouldReturnEmptyString_whenAnyWordIsPalindrome() {

        String[]    words = {"def","ghi"};
        String      expectedOutput = "";

        String  result = FindFirstPalindromicStringInArray.firstPalindrome(words);

        assertEquals(expectedOutput, result);
    }
}