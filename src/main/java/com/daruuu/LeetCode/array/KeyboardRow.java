package com.daruuu.LeetCode.array;

public class KeyboardRow {
    /*
    500. Keyboard Row
    Given an array of strings words, return the words that can be typed using letters
    of the alphabet on only one row of American keyboard like the image below.
    Note that the strings are case-insensitive, both lowercased and uppercased
    of the same letter are treated as if they are at the same row.

    In the American keyboard:
    the first row consists of the characters "qwertyuiop",
    the second row consists of the characters "asdfghjkl", and
    the third row consists of the characters "zxcvbnm".

    Example 1:
        Input: words = ["Hello","Alaska","Dad","Peace"]
        Output: ["Alaska","Dad"]
    Explanation:
    Both "a" and "A" are in the 2nd row of the American keyboard due to case insensitivity.

    Example 2:
        Input: words = ["omk"]
        Output: []

    Example 3:
        Input: words = ["adsdf","sfd"]
        Output: ["adsdf","sfd"]

    Constraints:
        1 <= words.length <= 20
        1 <= words[i].length <= 100
        words[i] consists of English letters (both lowercase and uppercase).
     */
    public static String[]  findWords(String[] words)
    {
        String  rowOne = "qwertyuiop";
        String  rowTwo = "asdfghjkl";
        String  rowThree = "zxcvbnm";
        String[]    result = new String[words.length];

        int     count1;
        int     count2;
        int     count3;
        int i;
        int j;
        int k;

//        Input: words = ["Hello","Alaska","Dad","Peace"]
//        Output: ["Alaska","Dad"]
        i = 0;
        k = 0;
        //  i < 4
        while (i < words.length)
        {
            //  j < "Hello".length
            String  tmpWord = words[i].toLowerCase();
            j = 0;
            count1 = 0;
            count2 = 0;
            count3 = 0;
            while (j < tmpWord.length())
            {
                char    c = tmpWord.charAt(j);
                if (rowOne.indexOf(c) != -1)
                    count1++;
                else if (rowTwo.indexOf(c) != -1)
                    count2++;
                else if (rowThree.indexOf(c) != -1)
                    count3++;
                j++;
            }
            if ((count1 > 0 && count2 == 0 && count3 == 0) ||
                    (count2 > 0 && count1 == 0 && count3 == 0) ||
                    (count3 > 0 && count1 == 0 && count2 == 0))
            {
                result[k] = words[i];
                k++;
            }
            i++;
        }
        String[]    filtered = new String[k];
        for (int l = 0; l < k; l++) {
            filtered[l] = result[l];
        }
        return (filtered);
    }


    /*
    public static String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        List<String> result = new ArrayList<>();

        for (String word : words) {
            String lowerWord = word.toLowerCase();
            char firstChar = lowerWord.charAt(0);
            String referenceRow = null;

            // Determina en qué fila está la primera letra
            if (row1.indexOf(firstChar) != -1)
                referenceRow = row1;
            else if (row2.indexOf(firstChar) != -1)
                referenceRow = row2;
            else if (row3.indexOf(firstChar) != -1)
                referenceRow = row3;

            boolean isValid = true;
            for (char c : lowerWord.toCharArray()) {
                if (!referenceRow.contains(String.valueOf(c))) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) result.add(word); // usa palabra original
        }

        return result.toArray(new String[0]);
    }
     */

}
