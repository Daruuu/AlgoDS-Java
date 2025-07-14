package com.daruuu.LeetCode.twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @Test
    void    shouldReturnTrue_isStringIsPalindrome() {

        String input = "A man, a plan, a canal: Panama";

        boolean result = ValidPalindrome.isPalindrome(input);

        assertTrue(result);
    }
}