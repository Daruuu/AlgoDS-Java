package com.daruuu.HackerRank.Algorithms.diagonaldifference03;

import java.util.List;

public class DiagonalDifference {

/*
    Sample Input

    STDIN      Function
    -----      --------
        3       arr[][] sizes n = 3, m = 3
    11 2 4      arr = [[11, 2, 4], [4, 5, 6], [10, 8, -12]]
    4 5 6
    10 8 -12

    Sample Output:
        15
    Explanation::
    The primary diagonal is:    11 + 5 + -12
    Sum across the primary diagonal: .
    The secondary diagonal is:  4 + 5 + 10
*/

    public static int   diagonalDifference(List<List<Integer>> arr)
    {
        List<Integer>   rows;
        int sumPrimary;
        int sumSecundary;
        int i;
        int j;
        int n;

        sumPrimary = 0;
        sumSecundary = 0;
        n = arr.size();
        i = 0;
        while (i < n)
        {
            rows = arr.get(i);
            j = 0;
            while (j < n)
            {
                if (i == j)
                    sumPrimary += rows.get(j);  //  diagonal principal
                if (j == n - 1 - i)
                    sumSecundary += rows.get(j);    //diagonal secundaria
                j++;
            }
            i++;
        }
        return (Math.abs(sumPrimary - sumSecundary));
    }
}
