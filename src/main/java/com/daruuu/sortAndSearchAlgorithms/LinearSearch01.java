package com.daruuu.sortAndSearchAlgorithms;

import java.util.List;

public class LinearSearch01 {
    /*
    📘 Problem #1 — Linear Search
    🧠 Title:
    Find the First Occurrence of a Target in an Array

    📋 Description:
    Given an array of integers nums and an integer target,
    return the index of the first occurrence of target in the array.
    If target is not found, return -1.

    📥 Input Example:

    nums = {4, 2, 7, 1, 7, 3}
    target = 7

    📤 Output Example:
    2
    💡 Constraints:
        You must not use any library function like indexOf.
        Time complexity should be O(n).
        Solve it using Linear Search.
    */

    public static int findFirstOccurrenceInList(List<Integer> numbers, int target)
    {
        int i;

        if (numbers == null || numbers.isEmpty())
            return (-1);
        i = 0;
        while (i < numbers.size())
        {
            if (numbers.get(i) == target)
                return (i);
            i++;
        }
        return (-1);
    }

/*
    | Tipo de complejidad | Qué mide                      | En tu código                      |
    | ------------------- | ----------------------------- | --------------------------------- |
    | ⏱️ Tiempo `O(n)`    | Cuántas operaciones haces     | 1 comparación por elemento        |
    | 💾 Espacio `O(1)`   | Cuánta memoria extra consumes | Solo unas pocas variables simples |
*/
}
