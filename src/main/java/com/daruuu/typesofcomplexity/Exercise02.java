package com.daruuu.typesofcomplexity;

public class Exercise02 {
    /**
     * 🧠 Ejercicio 2 — Complejidad O(n)
     * Enunciado:
     * Implementa una función que reciba un array de enteros y devuelva la suma de todos sus elementos.
     *
     * Ejemplo:
     * Entrada: [1, 2, 3, 4]
     * Salida: 10
     */
    public static int   getTheSumOfAllItemsInArray(int[] array)
    {
        int i;

        int sumOfArrayItems;
        sumOfArrayItems = 0;

        if (array == null || array.length == 0)
            return (-1);
        i = 0;
        while (i < array.length)
        {
            sumOfArrayItems += array[i];
            i++;
        }
        return  (sumOfArrayItems);
    }
    /*
    Análisis de complejidad
    Tiempo:
    O(n) — Recorre todos los elementos una sola vez.
    Espacio:
    O(1) — Solo se usa una variable para acumular la suma.
*/
}
