package com.daruuu.LeetCode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomantoIntegerTest {

    @Test
    void    shouldReturnThree_whenRomanToIntIsThree() {
        String  sInput  = "III";
        int expectedOutput = 3;

        int result = RomantoInteger.romanToInt(sInput);

        assertEquals(expectedOutput, result);
    }
}