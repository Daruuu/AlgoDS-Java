package com.daruuu.LeetCode.arrays101.squaresofsortedarray03;

public class SortedSquares {

    public static int[] sortedSquares(int[] nums)
    {
        int []  squareNumbers = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            squareNumbers[i] = nums[i] * nums[i];
        }
        int tmp = squareNumbers[0];
        for (int i = 1; i < squareNumbers.length; i++) {
            //  5 > 3
            if (tmp > squareNumbers[i])
            {
                squareNumbers[i] = tmp;
                tmp = squareNumbers[i - 1];
            }
        }
        return (squareNumbers);
    }
}
