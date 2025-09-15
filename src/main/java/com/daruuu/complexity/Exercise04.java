package com.daruuu.typesofcomplexity;

public class Exercise04 {
/*
    🧠 Exercise 4 — Time Complexity O(log n)
    Description:
    Given a sorted array of integers and a target number, implement a binary search
    to check whether the target is present in the array.
    Return true if found, otherwise return false.

    ✳️ Example:
    Input: arr = [1, 3, 5, 7, 9], target = 5
    Output: true
    */

    //  This function contains a busqueda lineal: O(n).
    public static boolean   findATargetInArrayOfNumbersLinealSearch(int []array, int target)
    {
        if (array == null || array.length == 0)
            return (false);
        int i;

        i = 0;
        while (i < array.length)
        {
            if (array[i] == target)
                return (true);
            i++;
        }
        return (false);
    }

    //  This function contains a busqueda lineal: O(n).
    public static boolean   findATargetInArrayOfNumbersBinarySearch(int []array, int target)
    {
        if (array == null || array.length == 0)
            return (false);
        int i;
        int low;
        int high;

        low = 0;
        high = array.length - 1;
        while (low <= high)
        {
            i = (low + high) / 2;
            if (array[i] == target)
                return (true);
            else if (target > array[i])
            {
                low = i + 1;
            }
            else
                high = i - 1;
        }
        return (false);
    }
}
