package com.daruuu.LeetCode;

import com.daruuu.LeetCode.array.StringMatchingInArray;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringMatchingInArrayTest {

    @Test
    void    shouldReturnTwoStrings_whenStringMatchingIsValid() {

        String []   inputWords = {"mass","as","hero","superhero"};
        List<String>    expectedOutput = new ArrayList<>();
        expectedOutput.add("as");
        expectedOutput.add("hero");

        List<String> result = StringMatchingInArray.stringMatching(inputWords);

        assertEquals(expectedOutput, result);
    }

    @Test
    void    shouldReturnTwoStrings_whenStringMatchingIsValid01() {

        String []   inputWords = {"leetcode","et","code"};
        List<String>    expectedOutput = new ArrayList<>();
        expectedOutput.add("et");
        expectedOutput.add("code");

        List<String> result = StringMatchingInArray.stringMatching(inputWords);

        assertEquals(expectedOutput, result);
    }
}