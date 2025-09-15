package com.daruuu.LeetCode.array;

import java.util.ArrayList;
import java.util.List;

public class StringMatchingInArray {
    /*
    Given an array of string words, return all strings in words that are a
    substring of another word. You can return the answer in any order.

    Example 1:
        Input: words = ["mass","as","hero","superhero"]
        Output: ["as","hero"]
        Explanation: "as" is substring of "mass" and "hero" is substring of "superhero".
        ["hero","as"] is also a valid answer.

    Example 2:
        Input: words = ["leetcode","et","code"]
        Output: ["et","code"]
        Explanation: "et", "code" are substring of "leetcode".

    Example 3:
        Input: words = ["blue","green","bu"]
        Output: []
        Explanation: No string of words is substring of another string.

    Constraints:
        1 <= words.length <= 100
        1 <= words[i].length <= 30
        words[i] contains only lowercase English letters.
        All the strings of words are unique.
     */
    public static List<String>  stringMatching(String[] words)
    {
        if (words == null || words.length == 0)
            return (null);
        int i;
        int j;
        List<String> result = new ArrayList<>();
        i = 0;
        while (i < words.length)
        {
            j = 0;
            while (j < words.length)
            {
                if (i == j)
                {
                    j++;
                    continue ;
                }
                //  mass        as
                if (words[j].contains(words[i]))
                {
                    if (!result.contains(words[i]))
                    {
                        result.add(words[i]);
                    }
                    break;
                }
                j++;
            }
            i++;
        }
        return (result);
    }
}
