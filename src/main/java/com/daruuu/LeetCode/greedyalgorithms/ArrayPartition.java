package com.daruuu.LeetCode.greedyalgorithms;

public class ArrayPartition {
    /*
    561. Array Partition
    Easy
    Given an integer array nums of 2n integers,
    group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn)
    such that the nums of min(ai, bi) for all i is maximized. Return the maximized nums.

    Example 1:
    Input: nums = [1,4,3,2]
    Output: 4
    Explanation: All possible pairings (ignoring the ordering of elements) are:
    1. (1, 4), (2, 3) -> min(1, 4) + min(2, 3) = 1 + 2 = 3
    2. (1, 3), (2, 4) -> min(1, 3) + min(2, 4) = 1 + 2 = 3
    3. (1, 2), (3, 4) -> min(1, 2) + min(3, 4) = 1 + 3 = 4
    So the maximum possible nums is 4.

    Example 2:
    Input: nums = [6,2,6,5,1,2]
    Output: 9
    Explanation: The optimal pairing is (2, 1), (2, 5), (6, 6). min(2, 1) + min(2, 5) + min(6, 6) = 1 + 2 + 6 = 9.

    Constraints:
    1 <= n <= 104
    nums.length == 2 * n
    -104 <= nums[i] <= 104
     */
    public static int   arrayPairSum(int [] nums)
    {
        if (nums == null || nums.length % 2 == 1)
            return (-1);
        int i;
        int k;
        int minIndex;
        int sum;

        //  Part 1: sort the array
        i = 0;
        while (i < nums.length)
        {
            minIndex = i;
            k = i + 1;
            while (k < nums.length)
            {
                if (nums[k] < nums[minIndex])
                    minIndex = k;
                k++;
            }
            int tmp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = tmp;
            i++;
        }
        //  Part 2: Formar pares consecutivos
        sum = 0;
        for (k = 0; k < nums.length; k += 2) {
            sum += nums[k]; //  PART 3: sumar todos los menores de cada par
        }
        return (sum);
    }
}
