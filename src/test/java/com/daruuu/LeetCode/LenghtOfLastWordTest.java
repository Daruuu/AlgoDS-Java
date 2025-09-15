package com.daruuu.LeetCode;

import com.daruuu.problems.leetcode.easy.strings.LengthOfLastWord;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LenghtOfLastWordTest {

    @Test
    void    shouldReturnFive_whenLengthOfLastWordIsWorld() {
        //  given
        String   s = "Hello World";
        int     expectedResult = 5;

        //  when
        int     result = LengthOfLastWord.lengthOfLastWordInString(s);

        //  then
        assertEquals(expectedResult, result);
    }
}