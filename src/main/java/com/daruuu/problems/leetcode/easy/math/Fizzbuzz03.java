package com.daruuu.LeetCode.leetcodeBeginnersGuide;

import java.util.ArrayList;
import java.util.List;

public class Fizzbuzz03 {
    /*
    412. Fizz Buzz
    Given an integer n, return a string array answer (1-indexed) where:

    answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
    answer[i] == "Fizz" if i is divisible by 3.
    answer[i] == "Buzz" if i is divisible by 5.
    answer[i] == i (as a string) if none of the above conditions are true.

    Example 1:
        Input: n = 3
        Output: ["1","2","Fizz"]
    Example 2:
        Input: n = 5
        Output: ["1","2","Fizz","4","Buzz"]
    Example 3:
        Input: n = 15
        Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
    Constraints:
        1 <= n <= 104
     */
    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0)
                result.add("FizzBuzz");
            else if (i % 3 == 0)
                result.add("Fizz");
            else if (i % 5 == 0)
                result.add("Buzz");
            else
                result.add(Integer.toString(i));
        }
        return (result);
    }

    public static List<String> fizzBuzzWIthBooleanFlags(int n) {
        List<String> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 && divisibleBy5)
                answer.add("FizzBuzz");
            else if (divisibleBy3)
                answer.add("Fizz");
            else if (divisibleBy5)
                answer.add("Buzz");
            else
                answer.add(String.valueOf(i));
        }
        return (answer);
    }


    public static List<String> fizzBuzzWIthBooleanFlagsImproveComplexity(int n) {
        List<String> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;
            String  currStr = "";

            if (divisibleBy3)
                currStr += ("Fizz");
            if (divisibleBy5)
                currStr += ("Fizz");
            if (currStr.isEmpty())
                currStr += String.valueOf(i);

            answer.add(currStr);
        }
        return (answer);
    }
}
