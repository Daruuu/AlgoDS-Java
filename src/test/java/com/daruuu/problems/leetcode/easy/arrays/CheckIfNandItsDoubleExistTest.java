package com.daruuu.problems.leetcode.easy.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfNandItsDoubleExistTest {

    @Test
    void should_returnTrue_when_checkIfFirstNumberIsEqualofMultiplyOfSecondAndThirdNumberInArray() {
        //  arrange

//        int []arr = {3,1,7,11};
        int []arr = {10,2,5,11};

        //  act
        boolean result = CheckIfNandItsDoubleExist.checkIfExist(arr);

        //  assert
//        assertFalse(result);
        assertTrue(result);

    }
}