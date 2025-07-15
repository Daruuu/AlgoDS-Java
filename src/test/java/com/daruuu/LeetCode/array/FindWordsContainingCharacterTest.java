package com.daruuu.LeetCode.array;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindWordsContainingCharacterTest {

    @Test
    void    shouldReturnListOf2Values_whenWeFoundTheCharacterXInTwoWords() {
        //  Arrange
        String[]    inputWords = {"leet","code"};
        char    x = 'e';
//        List<Integer>   expectedOutput = new ArrayList<>();
//        expectedOutput.add(0);
//        expectedOutput.add(1);
        List<Integer>   expectedOutput = List.of(0, 1);
        //  Act
        List<Integer>   result = FindWordsContainingCharacter.findWordsContainingWithWileIterate(inputWords, x);

        //  Assert
        assertEquals(expectedOutput, result);
    }
}