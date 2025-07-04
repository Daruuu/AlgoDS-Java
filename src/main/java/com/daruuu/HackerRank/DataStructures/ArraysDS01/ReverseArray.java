package com.daruuu.HackerRank.DataStructures.ArraysDS01;

import java.util.ArrayList;
import java.util.List;

public class ReverseArray {

    public static List<Integer> reverseArray(List<Integer> a)
    {
        List<Integer>   arrayResult = new ArrayList<>();
        int lenArray;
        int i;

        i = 0;
        lenArray = a.size();
        while (i < lenArray)
        {
            arrayResult.add(a.get(lenArray - i - 1));
            i++;
        }
        return (arrayResult);
    }

}
