package com.daruuu.typesofcomplexity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise04Test {

    @Test
    void shouldReturnTrue_whenTargetIsPresentInArray() {
        //  Given
        int[] givenArray = {1, 2 , 300, 1000, 10002};
        boolean resultTarget;
        int target = givenArray[givenArray.length - 1];

        //  When
        resultTarget = Exercise04.findATargetInArrayOfNumbersBinarySearch(givenArray, target);

        //  Then
        assertTrue(resultTarget);
    }

    @Test
    void   shouldReturnFalse_whenTheTargetAreNotInTheArray() {
        //  Given
        int[]   givenArray = {1, 2 , 300, 1000, 10002};
        boolean resultFunction;
        int     target = 999;

        //  When
        resultFunction = Exercise04.findATargetInArrayOfNumbersBinarySearch(givenArray, target);

        //  Then
        assertFalse(resultFunction, "should return false");
     }
}