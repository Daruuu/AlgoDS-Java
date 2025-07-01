package com.daruuu.typesofcomplexity;

public class Exercise01 {

    /*
    Ejercicio 1 — Complejidad O(1)
    Enunciado:
    Dado un array de enteros nums, implementa una función que devuelva el primer elemento del array.
    Ejemplo:
    Entrada: [10, 20, 30]
    Salida: 10
    */
    public static int getFirstElementOfArray(int[] array)
    {
        if (array == null || array.length == 0)
            return (-1);
        return (array[0]);
    }
/*
    Análisis de complejidad

    Tiempo (Big O):
    O(1) — Siempre accede directamente a array[0], sin importar cuántos elementos tenga el array.

    Espacio:
    O(1) — No usas estructuras adicionales, solo variables primitivas.
*/
}
