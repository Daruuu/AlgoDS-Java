package com.daruuu.typesofcomplexity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class Exercise01Test {

    @Test
    void    getFirstElementOfArrayNotNull() {
        //  Arrange
        int [] array = {10, 20, 30};

        //  Act
        int result = Exercise01.getFirstElementOfArray(array);

        //  Assert
        assertEquals(10, result);
    }

    @Test
    void    shouldReturnNegativeValueIfArrayIsNull() {
        //  Arrange
        int [] array = null;

        //  Act
        int result = Exercise01.getFirstElementOfArray(array);

        //  Assert
        assertEquals(-1, result);
    }
}