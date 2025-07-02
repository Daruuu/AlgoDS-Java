package com.daruuu.typesofcomplexity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise02Test {

    @Test
    void    getTheSumOfAllItemsInArray() {
        //  Arrange
        int []  arrayToTest = {1, 2, 3, 4};
        int spected = 10;
        int actualSum;

        //  Act
        actualSum = Exercise02.getTheSumOfAllItemsInArray(arrayToTest);

        //  Assert
        assertEquals(spected, actualSum, "Result is equals");
    }

    @Test
    void    shouldReturnMinusOneIfArrayIsNull() {
        //  Arrange
        int actualSum;

        //  Act
        actualSum = Exercise02.getTheSumOfAllItemsInArray(null);

        //  Assert
        assertEquals(-1, actualSum);
    }
}