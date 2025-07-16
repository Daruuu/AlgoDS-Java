package com.daruuu.LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToIntegerTest {

    @Test
    void    shouldReturn42_whenMyAtoiIsValid() {
        String  sInput = " -042";
        int     expectedOutput= -42;

//        Explanation:
//        Step 1: "   -042" (leading whitespace is read and ignored)
//                    ^
//        Step 2: "   -042" ('-' is read, so the result should be negative)
//                     ^
//        Step 3: "   -042" ("042" is read in, leading zeros ignored in the result)

        int result = StringToInteger.myAtoi(sInput);

        assertEquals(expectedOutput, result);
    }

    @Test
    void shouldReturnInteger_whenInputIsValid() {
        assertEquals(42, StringToInteger.myAtoi("42"));
        assertEquals(-42, StringToInteger.myAtoi("   -42"));
        assertEquals(4193, StringToInteger.myAtoi("4193 with words"));
        assertEquals(0, StringToInteger.myAtoi("words and 987"));
        assertEquals(Integer.MIN_VALUE, StringToInteger.myAtoi("-91283472332"));
    }

}