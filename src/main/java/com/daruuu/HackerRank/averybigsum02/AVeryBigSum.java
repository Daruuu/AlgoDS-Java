package com.daruuu.HackerRank.averybigsum02;

import java.util.List;

public class AVeryBigSum {

    public static long  aVeryBigSum(List<Long> ar){

        if (ar.get(0) == null)
            return (0);
        int     i;
        long    sumCounter;

        i = 0;
        sumCounter = 0;
        while (i < ar.size())
        {
            sumCounter += ar.get(i);
            i++;
        }
        return (sumCounter);
    }
}
