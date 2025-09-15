package com.daruuu.LeetCode.arrays101.squaresofsortedarray03;

public class SortedSquares {

    public static int[] sortedSquares(int[] nums)
    {
        int []  squareNumbers = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            squareNumbers[i] = nums[i] * nums[i];
        }
        //  BUBBLE SORT
        int tmp;
        for (int i = 0; i < squareNumbers.length - 1; i++) {
            for (int j = 0; j < squareNumbers.length - i - 1; j++) {
                //  5 > 3
                if (squareNumbers[j] > squareNumbers[j + 1])
                {
                    tmp = squareNumbers[j];
                    squareNumbers[j] = squareNumbers[j + 1];
                    squareNumbers[j + 1] = tmp;
                }
            }
        }
        return (squareNumbers);
    }
}
