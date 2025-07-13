package com.daruuu.LeetCode.twopointers;

public class FindFirstPalindromicStringInArray {
    /*
    2108. Find First Palindromic String in the Array
    Given an array of strings words, return the first palindromic string in the array.
    If there is no such string, return an empty string "".

    A string is palindromic if it reads the same forward and backward.

    Example 1:
        Input: words = ["abc","car","ada","racecar","cool"]
        Output: "ada"
        Explanation: The first string that is palindromic is "ada".
        Note that "racecar" is also palindromic, but it is not the first.
    Example 2:
        Input: words = ["notapalindrome","racecar"]
        Output: "racecar"
        Explanation: The first and only string that is palindromic is "racecar".
    Example 3:
        Input: words = ["def","ghi"]
        Output: ""
        Explanation: There are no palindromic strings, so the empty string is returned.

    Constraints:
        1 <= words.length <= 100
        1 <= words[i].length <= 100
        words[i] consists only of lowercase English letters.
     */
    public static String firstPalindrome(String [] words)
    {
        if (words == null || words.length == 0)
            return ("");
        int i;
        int j;
        int k;
        String  tmpWord;
        boolean isPalindrome;

        i = 0;
        while (i < words.length)
        {
            tmpWord = words[i];
            j = 0;
            k = tmpWord.length() - 1;
            isPalindrome = true;
            while (j < k)
            {
                if (tmpWord.charAt(j) != tmpWord.charAt(k))
                {
                    isPalindrome = false;
                    break ;
                }
                j++;
                k--;
            }
            if (isPalindrome)
                return (tmpWord);
            i++;
        }
        return ("");
    }
}
