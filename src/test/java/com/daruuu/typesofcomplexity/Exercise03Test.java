package com.daruuu.typesofcomplexity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise03Test {

    @Test
    void    shouldReturnAllOrderedPairs_whenInputHasThreeElements() {
        //  Given
        int[]   arrayInput = {1, 2, 3};

        //  when
        int[][] matrixResult;

        matrixResult = Exercise03.getAllPossibleCombinationsInTheSameArrayValues(arrayInput);

        //  Then
        int[][] expectedResult = {
                {1, 2}, {1, 3},
                {2, 1}, {2, 3},
                {3, 1}, {3, 2},
        };
        assertArrayEquals(expectedResult, matrixResult);
//        assertEquals(expectedResult, matrixResult);
    }
/*
    ¿Por qué usar assertArrayEquals(expected, result)?
    Porque assertEquals() no funciona con arrays de arrays.
    assertArrayEquals() compara que ambos arrays tengan el mismo tamaño
    y los mismos elementos en el mismo orden.

*/
    @Test
    void    shouldReturnNull_whenInputIsNullOrEmpty() {
    //  Given

    //  when

    assertNull(Exercise03.getAllPossibleCombinationsInTheSameArrayValues(null));
    assertNull(Exercise03.getAllPossibleCombinationsInTheSameArrayValues(new int[] {}));
    }
}