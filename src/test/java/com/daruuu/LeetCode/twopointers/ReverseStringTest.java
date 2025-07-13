package com.daruuu.LeetCode.twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void    shouldReturnRevereString_whenStringIsValid() {
        char [] input = {'h','e','l','l','o'};
        char [] expectedResult = {'o','l','l','e','h'};

        ReverseString.reverseString(input);

//        assertEquals(expectedResult, ReverseString.reverseString(input));
        assertArrayEquals(expectedResult, input);
    }
}