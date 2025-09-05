package com.daruuu.LeetCode.arrays101.findnumswithevennums02;

public class FindNumbers {
    public static int findNumbers(int[] nums)
    {
        int countDigitInNumberIsEven;
        countDigitInNumberIsEven = 0;
        //  nums = [12, 345, 2, 6, 7896]
        for (int i = 0; i < nums.length; i++) {
            String  num = String.valueOf(nums[i]);
            if (num.length() % 2 == 0)
                countDigitInNumberIsEven++;
        }
        return (countDigitInNumberIsEven);
    }
}
