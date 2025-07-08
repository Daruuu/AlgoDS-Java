package com.daruuu.LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LenghtOfLastWordTest {

    @Test
    void    shouldReturnFive_whenLengthOfLastWordIsWorld() {
        //  given
        String   s = "Hello World";
        int     expectedResult = 5;

        //  when
        int     result = LenghtOfLastWord.lengthOfLastWordInString(s);

        //  then
        assertEquals(expectedResult, result);

    }
}