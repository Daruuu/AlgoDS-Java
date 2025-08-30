package com.daruuu.LeetCode.leetcodeBeginnersGuide;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfStepsToReduceANumberToZero04Test {

    @Test
    void numberOfSteps() {
        //  given
        int num = 14;
        int expextResult = 6;

        //  when
        int result = NumberOfStepsToReduceANumberToZero04.numberOfSteps(num);

        //  then
        assertEquals(expextResult, result);
    }
}
