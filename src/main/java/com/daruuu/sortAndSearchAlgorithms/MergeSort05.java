package com.daruuu.sortAndSearchAlgorithms;

import java.util.Arrays;

public class MergeSort05 {
    /*
    Vamos con el siguiente más importante en entrevistas y uno de los más eficientes:
    ---
    **🧠 Title:**
    Sort an Array Using Merge Sort

    **📋 Description:**
    Implement the **Merge Sort** algorithm to sort an array of integers in **ascending order**.

    Merge Sort is a **divide-and-conquer** algorithm that:

    1. Divides the array into halves recursively,
    2. Sorts each half,
    3. Merges the sorted halves into a final sorted array.

    You must use recursion and the merging process must be implemented manually.

    **📥 Input Example:**
    ```java
    nums = [5, 2, 9, 1, 6]
    ```

    **📤 Output Example:**
    ```java
    [1, 2, 5, 6, 9]
    ```
    ---
    ### ✅ Constraints:

    * Do not use built-in sorting methods.
    * Must implement the **Merge Sort algorithm** from scratch.
    * Time complexity: **O(n log n)**
    * Space complexity: **O(n)** — due to additional arrays used in merging.
    * Recursive implementation is required.
     */

    public static int []    sortArrayUsingMergeSort(int[] array)
    {
        //  len del array es <= 1
        if (array.length <= 1)
            return (array);
        int mid;
        mid = array.length / 2;

        int[]   left = Arrays.copyOfRange(array, 0, mid);
        int[]   right = Arrays.copyOfRange(array, mid, array.length);

        left = sortArrayUsingMergeSort(left);
        right = sortArrayUsingMergeSort(right);

        //  is like join left + right
        int[]   result = new int[array.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length)
        {
            if (left[i] <= right[j])
                result[k++] = left[i++];
            else
                result[k++] = right[j++];
        }
        while (i < left.length)
            result[k++] = left[i++];
        while (j < right.length)
            result[k++] = right[j++];
        return (result);
    }
}
