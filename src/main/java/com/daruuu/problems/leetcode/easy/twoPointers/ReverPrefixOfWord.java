package com.daruuu.LeetCode.twopointers;

public class ReverPrefixOfWord {
    /*
    2000. Reverse Prefix of Word
    Given a 0-indexed string word and a character ch, reverse the segment of word
    that starts at index 0 and ends at the index of the first occurrence of ch (inclusive).
    If the character ch does not exist in word, do nothing.

    For example, if word = "abcdefd" and ch = "d", then you should reverse
    the segment that starts at 0 and ends at 3 (inclusive).
    The resulting string will be "dcbaefd".
    Return the resulting string.

    Example 1:
        Input: word = "abcdefd", ch = "d"
        Output: "dcbaefd"
        Explanation: The first occurrence of "d" is at index 3.
        Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".
    Example 2:
        Input: word = "xyxzxe", ch = "z"
        Output: "zxyxxe"
        Explanation: The first and only occurrence of "z" is at index 3.
        Reverse the part of word from 0 to 3 (inclusive), the resulting string is "zxyxxe".
    Example 3:
        Input: word = "abcd", ch = "z"
        Output: "abcd"
        Explanation: "z" does not exist in word.
        You should not do any reverse operation, the resulting string is "abcd".
    Constraints:
        1 <= word.length <= 250
        word consists of lowercase English letters.
        ch is a lowercase English letter.
     */
    public static String reversePrefix(String word, char ch)
    {
        int index = word.indexOf(ch);

        if (index == -1) {
            return (word);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(word.substring(0, index + 1));
        sb.reverse();
        sb.append(word.substring(index + 1));

        return sb.toString();
    }

/*
    public static String reversePrefix (String word, char ch)
    {
        if (word == null || word.length() == 0)
            return (null);
        String  result = "";
        int i;
        int posIndex = 0;
        int posCharacter = 0;

        i = 0;
        while (i < word.length() - 1)
        {
            if (word.charAt(i) == ch)
            {
                posCharacter = i;
                posIndex = i + 1;
            }
            while (posCharacter >= 0 && i <= word.length() - 1)
            {
                result += word.charAt(posCharacter);
                posCharacter++;
            }
            while (posIndex <= word.length() - 1)
            {
                result += word.charAt(posIndex);
                posIndex++;
            }
            i++;
        }
        return (result);
    }
*/
}
