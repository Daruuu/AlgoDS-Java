package com.daruuu.LeetCode.leetcodeBeginnersGuide;

import java.util.HashMap;

public class RansomNote06 {
    /*
    https://leetcode.com/problems/ransom-note/description/
    383. Ransom Note
    Given two strings ransomNote and magazine,
    return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

    Each letter in magazine can only be used once in ransomNote.

    Example 1:
        Input: ransomNote = "a", magazine = "b"
        Output: false

    Example 2:
        Input: ransomNote = "aa", magazine = "ab"
        Output: false
    Example 3:
        Input: ransomNote = "aa", magazine = "aab"
        Output: true

    Constraints:

    1 <= ransomNote.length, magazine.length <= 105
    ransomNote and magazine consist of lowercase English letters.

    return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

    create an array of alphabet
    count the letters of magazine
    remove innecesary letter in ransomNote
     */
    public static boolean canConstruct(String ransomNote, String magazine)
    {
        //  arrays of frequency to letters to a-z
        int[]  arrayAlphabet = new int[26];

        for(char c : magazine.toCharArray())
        {
            arrayAlphabet[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray())
        {
            arrayAlphabet[c - 'a']--;
            if (arrayAlphabet[c - 'a'] < 0)
                return (false);
        }
        return (true);
    }

    public static boolean canConstructWithHashMap(String ransomNote, String magazine)
    {
        HashMap<Character, Integer> magazineLetters = new HashMap<>();
        //  arrays of frequency to letters to a-z
        for (int i = 0; i < magazine.length(); i++) {
            char m = magazine.charAt(i);

            int currentCount = magazineLetters.getOrDefault(m, 0);
            magazineLetters.put(m, currentCount + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char r = ransomNote.charAt(i);

            int currentCount = magazineLetters.getOrDefault(r, 0);
            if (currentCount == 0)
                return (false);
        }
        return (true);
    }
}
