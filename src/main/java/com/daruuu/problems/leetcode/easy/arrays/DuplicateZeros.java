package com.daruuu.LeetCode.arrays101.duplicatezeros;

public class DuplicateZeros {
    public static void  duplicateZeros(int[] arr)
    {
        int []  tmpArray = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length && j < arr.length; i++) {

            if (arr[i] == 0)
            {
                tmpArray[j] = 0;
                j++;
                if (j < arr.length)
                {
                    tmpArray[j] = 0;
                    j++;
                }
            }
            else
            {
                tmpArray[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = tmpArray[i];
        }
    }
}
