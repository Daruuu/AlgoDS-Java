package com.daruuu.sortAndSearchAlgorithms;

public class InsertionSort04 {
    /*
    ## 📘 Problem #5 — Insertion Sort

    **🧠 Title:**
    Sort an Array Using Insertion Sort

    **📋 Description:**
    Implement the **Insertion Sort** algorithm to sort an array of integers in **ascending order**.
    Insertion Sort builds the sorted array one element at a time by taking each element
    and placing it in its correct position among the previously sorted elements.

    You must sort the array **in place**, without using built-in sort methods.

    **📥 Input Example:**
    ```java
    nums = [8, 4, 2, 9, 1]
    ```
    **📤 Output Example:**

    ```java
    [1, 2, 4, 8, 9]
    ```
    ---
    ### ✅ Constraints:

    * No usage of `.sort()` or any library sorting utilities.
    * Must use the **Insertion Sort** technique (not Bubble or Selection).
    * Time complexity:

      * Worst case: **O(n²)**
      * Best case (already sorted): **O(n)**
    * Space complexity: **O(1)**

    ---

    ### 💡 Hint (if needed):

    In `Insertion Sort`, you iterate from index `1` to `n-1`, and for each element, you compare it with the previous sorted elements (to the left) and **shift them** if they’re larger, then insert the current value into its correct position.
    ---
    Cuando termines tu implementación, la revisamos con ojos de entrevista: legibilidad, eficiencia y explicación técnica clara. ¿Listo?
     */
//    public static List<Integer> sortArrayUsingInsertionSort(List<Integer> numList)
    public static int[] sortArrayUsingInsertionSort(int[] numList)
    {
        int i;
        int j;
        int key;

        if (numList == null || numList.length == 0)
            return (null);
        i = 1;
        while (i < numList.length)
        {
            key = numList[i];
            j = i - 1;
            while (j >= 0 && numList[j] > key)
            {
                numList[j + 1] = numList[j];
                j--;
            }
            numList[j + 1] = key;
            i++;
        }
        return (numList);
    }
}
