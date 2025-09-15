package com.daruuu.HackerRank.Algorithms.minimaxsum04;

import java.util.List;

public class MiniMaxSum {

        public static void  minimaxSum(List<Integer> arr){

            long    totalSum;
            long    minNumber;
            long    maxNumber;

            if (arr == null || arr.isEmpty())
                return ;
            totalSum = 0;
            minNumber = arr.get(0);
            maxNumber = arr.get(0);
            for (int num : arr)
            {
                totalSum += num;
                if (num < minNumber)
                    minNumber = num;
                if (num > maxNumber)
                    maxNumber = num;
            }
            System.out.println((totalSum - maxNumber) + " " + (totalSum - minNumber));
        }
}
