package com.daruuu.LeetCode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShuffleTheArrayTest {

//    Example 1:
//    Input: nums = [2,5,1,3,4,7], n = 3
//    Output: [2,3,5,4,1,7]
//    Explanation: Since  x1=2,   x2=5,   x3=1,
//                        y1=3,   y2=4,   y3=7
//    then the answer is [2,3,5,4,1,7].
    @Test
    void    shouldReturnNewArrayWithValuesUpdate_whenShuffleArray() {

        //  Arrange
        int[] numsInput = {2,5,1,3,4,7};
        int n = 3;
        int[]   expectedOutput = {2,3,5,4,1,7};

        //  Act
        int[]   result = ShuffleTheArray.shuffle(numsInput, n);

        //  Assert
        assertArrayEquals(expectedOutput, result);
    }
}