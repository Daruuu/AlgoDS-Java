package com.daruuu.sortAndSearchAlgorithms;

import java.util.List;

public class BinarySearch02 {
    /*
## 📘 Problem #2 — Binary Search

    **🧠 Title:**
    Check If Target Exists Using Binary Search

    **📋 Description:**
    You are given a **sorted array** of integers in ascending order and a `target` integer.
    Implement a function that returns `true` if the target exists in the array, and `false` otherwise.

    You **must** implement the solution using **binary search**, not linear search.

    **📥 Input Example:**
    - nums = [1, 3, 5, 7, 9, 11]
    - target = 7

    **📤 Output Example:**
    - true

    **📥 Input Example 2:**
    - nums = [2, 4, 6, 8, 10]
    - target = 5
    **📤 Output Example 2:**
    - false

    **✅ Constraints:**

    * Time complexity must be **O(log n)**.
    * The array will have at least 1 element.
    * You may not use Java’s built-in binary search (`Arrays.binarySearch()`).
     */

    //      - nums = [1, 3, 5, 7, 9, 11]
    //      - target = 7
    public static boolean   findTargetInSortedArrayUsingBinarySearch(List<Integer>  numList, int target)
    {
        if (numList == null || numList.isEmpty())
            return (false);

        int mid;
        int low;
        int high;
        low = 0;
        high = numList.size() - 1;
        while (low <= high)
        {
            mid = low + (high - low) / 2;
//            System.out.println("mid: " + mid);

            if (target == numList.get(mid))
                return (true);
            if (target > numList.get(mid))
                low = mid + 1;
            else
                high  = mid - 1;
        }
        return (false);
    }
}
