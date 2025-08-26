package com.daruuu.LeetCode.beginnerchallengeproblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfStepsToReduceANumberToZero_04Test {

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
