package com.daruuu.LeetCode;

import com.daruuu.LeetCode.array.KeyboardRow;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KeyboardRowTest {

//    void    shouldReturnTwoWorfs_whenStringArrayMatch() {
    @Test
    void    shouldReturnWordsTypedUsingOneKeyboardRow_whenMultipleWordsProvided() {

        String[]    inputWords = {"Hello","Alaska","Dad","Peace"};
        String[]    expectedOutput = {"Alaska","Dad"};

        String[]    result = KeyboardRow.findWords(inputWords);

        assertArrayEquals(expectedOutput, result);
    }

    @Test
//    void    shouldReturnEmptyString_whenOnlyOneWordAndTheCharactersAreInDifferentRows() {
    void    shouldReturnEmptyArray_whenWordUsesMultipleKeyboardRows() {

        String[]    inputWords = {"omk"};
        String[]    expectedOutput = {};

        String[]    result = KeyboardRow.findWords(inputWords);

        assertArrayEquals(expectedOutput, result);
    }

    @Test
//    void    shouldReturnTheSameStringArray_whenMatchesAllTheCharactersInSameRows() {
    void    shouldReturnAllWords_whenAllUseSingleKeyboardRow() {

        String[]    inputWords = {"adsdf","sfd"};
        String[]    expectedOutput = {"adsdf","sfd"};

        String[]    result = KeyboardRow.findWords(inputWords);

        assertArrayEquals(expectedOutput, result);
    }
}