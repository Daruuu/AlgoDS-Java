package com.daruuu.LeetCode.greedyalgorithms;

public class LongestPalindrome {
    /*
    Given a string s which consists of lowercase or uppercase letters,
    return the length of the longest palindrome that can be built with those letters.

    Letters are case-sensitive, for example, "Aa" is not considered a palindrome.

    Example 1:
    Input: s = "abccccdd"
    Output: 7
    Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.

    Example 2:
    Input: s = "a"
    Output: 1
    Explanation: The longest palindrome that can be built is "a", whose length is 1.

    Constraints:
        1 <= s.length <= 2000
        s consists of lowercase and/or uppercase English letters only.
     */
    public static int  longestPalindrome(String s)
    {
        if (s == null || s.isEmpty())
            return (-1);

        char [] asciiTable = new char[128];
        //  fill each position of char[] array with the letter exist in string s
        for (char c : s.toCharArray())
        {
            asciiTable[c]++;
        }
        int length = 0;
        boolean hasOdd = false;
        /*
        Por cada letra:
        Si aparece un número par de veces → úsalas todas.
        Si aparece un número impar → usa la cantidad par más cercana (ej: 5 → usa 4).
        Si al menos una letra tuvo frecuencia impar, puedes poner una en el centro.
         */
        for (int count : asciiTable)
        {
            if (count % 2 == 0)
                length += count;
            else
            {
                length += count - 1;
                hasOdd = true;
            }
        }
        if (hasOdd)
            length += 1;
        return (length);
    }
}
