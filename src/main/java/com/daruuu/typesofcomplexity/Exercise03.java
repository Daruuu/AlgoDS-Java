package com.daruuu.typesofcomplexity;

public class Exercise03 {
/*
    Ejercicio 3 — Complejidad O(n²)
    Enunciado:
    Implementa una función que, dado un array de enteros, devuelva todos los
    pares de números posibles (como tuplas o arrays de tamaño 2).

    Ejemplo:
    Entrada: [1, 2, 3]
    Salida: [(1,2), (1,3), (2,1), (2,3), (3,1), (3,2)]
    Salida: [
            (1,2),
            (1,3),
            (2,1),
            (2,3),
            (3,1),
            (3,2)
            ]
*/
    public static int[][]   getAllPossibleCombinationsInTheSameArrayValues(int[] array)
    {
        int[][] resultArray;
        int i;
        int totalPairs;
        int j;
        int n;
        int index;

        if (array == null || array.length == 0)
            return(null);
        n = array.length;
        totalPairs = n * (n - 1);
        resultArray = new int[totalPairs][2];

        i = 0;
        index = 0;
        while (i < n)
        {
            j = 0;
            while (j < n)
            {
                if (i != j)
                {
                    resultArray[index][0] = array[i];
                    resultArray[index][1] = array[j];
                    index++;
                }
                j++;
            }
            i++;
        }
        return (resultArray);
    }
    /*
    🧠 Análisis de complejidad
    Tiempo:
    O(n²) — Dos bucles anidados, comparando todos contra todos.

    Espacio:
    O(n²) — Porque generas n*(n-1) pares.
    */

    // Using List<int[]>


}
