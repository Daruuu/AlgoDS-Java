package com.daruuu.HackerRank.diagonaldifference03;

import com.daruuu.HackerRank.Algorithms.diagonaldifference03.DiagonalDifference;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DiagonalDifferenceTest {

    @Test
    void shouldReturnValidOutput_diagonalDifference() {
        //  given
        List<List<Integer>> matrixTwoD = new ArrayList<>();
        int     expectedOutput;

//        matrixTwoD.add(Arrays.asList(3));
        matrixTwoD.add(Arrays.asList(11, 2, 4));
        matrixTwoD.add(Arrays.asList(4, 5, 6));
        matrixTwoD.add(Arrays.asList(10, 8, -12));
        expectedOutput = 15;

        //  when
        int diagonalDifference = DiagonalDifference.diagonalDifference(matrixTwoD);

        //  then
        assertEquals(expectedOutput, diagonalDifference);
    }
}