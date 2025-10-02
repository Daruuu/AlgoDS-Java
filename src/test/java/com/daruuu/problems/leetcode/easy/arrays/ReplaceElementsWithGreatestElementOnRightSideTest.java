package com.daruuu.problems.leetcode.easy.arrays;

import com.daruuu.problems.leetcode.easy.arrays.inPlaceOperations.ReplaceElementsWithGreatestElementOnRightSide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceElementsWithGreatestElementOnRightSideTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void should_ReplaceOneElements_whenANumberIsGreatherThanNextNumber() {
        //  Arrange

        int[] arr = {17, 18, 5, 4, 6, 1};
        int[] expectedOutput = {18, 6, 6, 6, 1, -1};

        //  Act
        int [] result = ReplaceElementsWithGreatestElementOnRightSide.replaceElements(arr);

        //  Assert
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    void should_ReplaceElementWithMinusZero_whenIsOnlyOneNUmber() {
        //  Arrange

        int[] arr = {400};
        int[] expectedOutput = {-1};

        //  Act
        int [] result = ReplaceElementsWithGreatestElementOnRightSide.replaceElements(arr);

        //  Assert
        assertArrayEquals(expectedOutput, result);
    }

}