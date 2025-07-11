package com.daruuu.LeetCode;

public class FindIndexOfTheFirstOccurrenceInString {
    /*
    28. Find the Index of the First Occurrence in a String
    Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
    or -1 if needle is not part of haystack.

    Example 1:
        Input: haystack = "sadbutsad", needle = "sad"
        Output: 0
        Explanation: "sad" occurs at index 0 and 6.
        The first occurrence is at index 0, so we return 0.
    Example 2:
        Input: haystack = "leetcode", needle = "leeto"
        Output: -1
        Explanation: "leeto" did not occur in "leetcode", so we return -1.

    Constraints:
        1 <= haystack.length, needle.length <= 104
        haystack and needle consist of only lowercase English characters.
     */
    public static int   strstr(String haystack, String needle)
    {
        int i;
        int j;

        i = 0;
//        Input:
//        haystack = "leetcode" 8
//        needle = "leeto"      5
//        Output: -1
        //  i < 8 - 5 = 3
        while (i <= haystack.length() - needle.length())
        {
            j = 0;
            while (j < needle.length() && haystack.charAt(i + j) == needle.charAt(j))
            {
                j++;
            }
            if (j == needle.length())
                return (i);
            i++;
        }
        return (-1);
    }
}
