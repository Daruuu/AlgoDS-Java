package com.daruuu.LeetCode.beginnerchallengeproblems;

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
}
