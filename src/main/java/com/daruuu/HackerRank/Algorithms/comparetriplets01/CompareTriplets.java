package com.daruuu.HackerRank.Algorithms.comparetriplets01;

import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer>b)
    {
        List<Integer>   result = new ArrayList<>();
        int i;
        int left;
        int right;

        i = 0;
        left = 0;
        right = 0;
        while (i < a.size())
        {
            if (a.get(i) < b.get(i))
                left ++;
            else if (a.get(i) > b.get(i))
                right ++;
            i++;
        }
        result.add(right);
        result.add(left);
        return (result);
    }
}
