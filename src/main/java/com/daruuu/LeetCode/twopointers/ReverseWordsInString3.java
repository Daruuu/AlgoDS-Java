package com.daruuu.LeetCode.twopointers;

public class ReverseWordsInString3 {
    /*
    557. Reverse Words in a String III
    Given a string s, reverse the order of characters in each word within
    a sentence while still preserving whitespace and initial word order.

    Example 1:
        Input: s = "Let's take LeetCode contest"
        Output: "s'teL ekat edoCteeL tsetnoc"
    Example 2:
        Input: s = "Mr Ding"
        Output: "rM gniD"
    Constraints:
        1 <= s.length <= 5 * 104
        s contains printable ASCII characters.
        s does not contain any leading or trailing spaces.
        There is at least one word in s.
        All the words in s are separated by a single space.
     */
    public static String    reverseWords(String s)
    {
        if (s == null || s.length() == 0)
            return (null);
        StringBuilder  result = new StringBuilder();
        int i;
        int j;
        int start;
        int end;

//        Input: s = "Mr Ding"
//        Output: "rM gniD"
        i = 0;
        while (i < s.length())
        {
            start = i;
            while (i < s.length() && s.charAt(i) != ' ')
                i++;
            end = i;
            for (j = i - 1; j >= start; j--) {
                result.append(s.charAt(j));
            }
            if (i < s.length())
                result.append(' ');
            i++;
        }
        return (result.toString());
    }
}
