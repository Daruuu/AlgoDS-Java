package com.daruuu.LeetCode.twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverPrefixOfWordTest {

    @Test
    void    shouldReturnReversePrefix_whenCharExistsInWord() {
        String  inputWord = "abcdefd";
        char    ch = 'd';
        String  expectedOutput = "dcbaefd";

        String  result = ReverPrefixOfWord.reversePrefix(inputWord, ch);

        assertEquals(expectedOutput, result);
    }

    @Test
    void    shouldReturnSameWord_whenCharNotFound() {
        assertEquals("abcd", ReverPrefixOfWord.reversePrefix("abcd", 'z'));
    }

    @Test
    void    shouldReverseEntireWord_whenCharIsLastLetter() {
        assertEquals("fedcba", ReverPrefixOfWord.reversePrefix("abcdef", 'f'));
    }

    @Test
    void shouldReverseFirstLetter_whenCharIsFirstLetter() {
        assertEquals("abcdef", ReverPrefixOfWord.reversePrefix("abcdef", 'a'));
    }
}