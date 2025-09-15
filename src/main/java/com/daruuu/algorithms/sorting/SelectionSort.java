package com.daruuu.sortAndSearchAlgorithms;

public class SelectionSort {
    /*
    **🧠 Title:**
    Sort an Array Using Selection Sort

    **📋 Description:**
    Implement the **Selection Sort** algorithm to sort an array of integers in **ascending order**.
    The algorithm works by repeatedly finding the **minimum element** from the unsorted part and moving it to the beginning.
    You must sort the array **in place**, without using built-in sorting methods.

    **📥 Input Example:**
        nums = [29, 10, 14, 37, 13]

    **📤 Output Example:**
        [10, 13, 14, 29, 37]

    **✅ Constraints:**
        * No built-in `.sort()` or similar methods allowed.
        * Must implement the **Selection Sort** algorithm.
        * Time complexity: **O(n²)**.
        * Space complexity: **O(1)**.
---
    Recuerda: en Selection Sort, por cada posición `i`, buscas el **mínimo en el resto del array** (`i+1` hasta el final) y lo intercambias con la posición `i`.

    Cuando lo implementes, compártelo y te ayudo a revisarlo. ¿Vamos?
     */
    public static int[] sortArrayAscendingUsingSelectionSort(int[]  inputList) {
        int i;
        int j;
        int minIndex;
        int tmp;

        if (inputList == null || inputList.length == 0)
            return (null);
        i = 0;
        tmp = 0;
        while (i < inputList.length - 1)
        {
            minIndex = i;
            j = i + 1;
            while (j < inputList.length)
            {
                if (inputList[j] < inputList[minIndex])
                    minIndex = j;
                j++;
            }
            tmp = inputList[i];
            inputList[i] = inputList[minIndex];
            inputList[minIndex] = tmp;
            i++;
        }
        return (inputList);
    }
    /*
    Insertion Sort works by building a sorted portion of the array from left to right.
    For each element at position i (starting from index 1), the algorithm:

    1. Stores the current value.
    2. Compares it with elements to its left.
    3. Shifts larger elements one position to the right.
    4. Inserts the current value into its correct position.

    This process continues until the entire array is sorted in ascending order.
*/

/*
    🔍 ¿Qué hace este código?
    1.  Usa un bucle externo i para recorrer la lista desde el principio hasta el penúltimo elemento.
    2.  Usa un bucle interno j para buscar el índice del valor mínimo entre los elementos restantes.
    3.  Hace un intercambio entre el elemento actual (i) y el valor mínimo encontrado (minIndex).

    🧠 Complejidad
    Tiempo: O(n²) → dos bucles anidados
    Espacio: O(1) → sin estructuras auxiliares
*/
}
