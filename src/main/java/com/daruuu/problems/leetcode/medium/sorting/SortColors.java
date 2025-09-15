package com.daruuu.LeetCode.sorting;

public class SortColors {
    /*
    75. Sort Colors
    Companies
    Hint
    Given an array nums with n objects colored red, white, or blue,
    sort them in-place so that objects of the same color are adjacent,
    with the colors in the order red, white, and blue.

    We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
    You must solve this problem without using the library's sort function.

    Example 1:
        Input: nums = [2,0,2,1,1,0]
        Output: [0,0,1,1,2,2]
    Example 2:
        Input: nums = [2,0,1]
        Output: [0,1,2]

    Constraints:
        n == nums.length
        1 <= n <= 300
        nums[i] is either 0, 1, or 2.

    Follow up: Could you come up with a one-pass algorithm using only constant extra space?
     */
    public static void  sortColors(int [] nums)
    {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high)
        {
            if (nums[mid] == 0)
            {
                swap (nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;  //  ya esta bien ubicado
            } else if (nums[mid] == 2) {
                swap (nums, mid, high);
                high--; //el 2 va al final
            }
        }
    }

    private static void swap(int[] nums, int low, int mid) {
        int tmp = nums[low];
        nums[low] = nums[mid];
        nums[mid] = tmp;
    }
}
