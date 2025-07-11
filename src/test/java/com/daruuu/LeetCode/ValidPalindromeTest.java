package com.daruuu.LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @Test
    void    shouldReturnTrue_isStringIsPalindrome() {

        String input = "A man, a plan, a canal: Panama";
        boolean expectedOutput = true;

        boolean result = ValidPalindrome.isPalindrome(input);

        assertTrue(result);
    }
}