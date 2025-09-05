package com.daruuu.LeetCode.arrays101;

import com.daruuu.LeetCode.arrays101.maxconsecutivesones01.MaxConsecutiveOnes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxConsecutiveOnesTest {

    @Test
    void    shouldReturnTwo_whenFindConsecutiveOnes() {
        //given
        int[] inputArray = {1,0,1,1,0,1};
        int expectResult = 2;

        //when
        int resultFunction = MaxConsecutiveOnes.findMaxConsecutiveOnes(inputArray);

        //then
        assertEquals(expectResult, resultFunction);
    }

    @Test
    void shouldReturnTwo_whenArrayHasTwoConsecutiveOnes() {
        // given
        int[] inputArray = {1, 0, 1, 1, 0, 1};
        int expectedResult = 2;

        // when
        int result = MaxConsecutiveOnes.findMaxConsecutiveOnes(inputArray);

        // then
        assertEquals(expectedResult, result);
    }

    @Test
    void shouldReturnZero_whenArrayHasOnlyZeros() {
        // given
        int[] inputArray = {0, 0, 0, 0};
        int expectedResult = 0;

        // when
        int result = MaxConsecutiveOnes.findMaxConsecutiveOnes(inputArray);

        // then
        assertEquals(expectedResult, result);
    }

    @Test
    void shouldReturnLength_whenArrayHasOnlyOnes() {
        // given
        int[] inputArray = {1, 1, 1, 1, 1};
        int expectedResult = 5;

        // when
        int result = MaxConsecutiveOnes.findMaxConsecutiveOnes(inputArray);

        // then
        assertEquals(expectedResult, result);
    }
}