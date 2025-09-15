package com.daruuu.algorithms.sorting;

public class BubbleSort {
    /*
    📘 Problem #3 — Bubble Sort
    🧠 Title:
    Sort an Array Using Bubble Sort

    📋 Description:
    Implement the Bubble Sort algorithm to sort an array of integers in ascending order.
    You must sort the array in place (without creating a copy), and return the sorted array.

    📥 Input Example:
    nums = [5, 3, 8, 4, 2]

    📤 Output Example:
    [2, 3, 4, 5, 8]

    ✅ Constraints:
    - You are not allowed to use any built-in sort method.
    - The solution must use the Bubble Sort algorithm (with nested loops).
    - Time complexity should be O(n²) in the worst case.
    - Space complexity must be O(1) (no new arrays created).
     */

    public static   int[]   sortArrayUsingBubbleSortAlgorithm(int[] arrayInput)
    {
        int i;
        int j;
        int temp;

        i = 0;
        while (i < arrayInput.length - 1)
        {
            j = 0;
            while (j < arrayInput.length - i - 1)
            {
                if (arrayInput[j] > arrayInput[j + 1])
                {
                    temp = arrayInput[j];
                    arrayInput[j] = arrayInput[j + 1];
                    arrayInput[j + 1] = temp;
                }
                j++;
            }
            i++;
        }
        return (arrayInput);
    }
}
