package com.daruuu.LeetCode.leetcodeBeginnersGuide;

public class NumberOfStepsToReduceANumberToZero04 {
    /*
    https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
    Given an integer num, return the number of steps to reduce it to zero.

    In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.

    Example 1:

    Input: num = 14
    Output: 6
    Explanation:
    Step 1) 14 is even; divide by 2 and obtain 7.
    Step 2) 7 is odd; subtract 1 and obtain 6.
    Step 3) 6 is even; divide by 2 and obtain 3.
    Step 4) 3 is odd; subtract 1 and obtain 2.
    Step 5) 2 is even; divide by 2 and obtain 1.
    Step 6) 1 is odd; subtract 1 and obtain 0.
    Example 2:

    Input: num = 8
    Output: 4
    Explanation:
    Step 1) 8 is even; divide by 2 and obtain 4.
    Step 2) 4 is even; divide by 2 and obtain 2.
    Step 3) 2 is even; divide by 2 and obtain 1.
    Step 4) 1 is odd; subtract 1 and obtain 0.

    Example 3:
    Input: num = 123
    Output: 12

    Constraints:
        0 <= num <= 106
     */

    /**
     * 6 / 2 = 3
     * 3 - 1 = 2
     * 2 / 2 = 1
     * 1 - 1 = 0
     * Total steps : 4
     * <p>
     * Time complexity: O(logn)
     * Space complexity:
     *
     * @param num
     * @return
     */

    public static int numberOfSteps(int num) {

        int result = num;
        int steps = 0;

        while (result != 0) {

            if (result % 2 == 0)    // number is even=par
            {
                result /= 2;
                steps++;
            } else {
                result -= 1;
                steps++;
            }
        }
        return (steps);
    }

    /**
     * Calculates the number of steps required to reduce a given number to zero.
     * <p>
     * The process is as follows:
     * - If the number is even, divide it by 2.
     * - If the number is odd, subtract 1.
     * Repeat these steps until the number becomes 0.
     * <p>
     * Example:
     * num = 14
     * Steps: 14 -> 7 -> 6 -> 3 -> 2 -> 1 -> 0
     * Result = 6
     * <p>
     * Time Complexity: O(log n)
     * - Each division by 2 reduces the number significantly.
     * - At worst, we alternate between subtraction (odd -> even) and division.
     * - The number of operations is proportional to the number of bits in n.
     * <p>
     * Space Complexity: O(1)
     * - Only a few integer variables are used regardless of input size.
     *
     * @param num the starting number (must be >= 0)
     * @return the number of steps needed to reduce num to 0
     */

    public static int numberOfStepsImproved(int num) {

        int steps = 0;

        while (num > 0) {
            if (num % 2 == 0)    // number is even=par
            {
                num /= 2;
            } else {
                num--;
            }
            steps++;
        }
        return (steps);
    }
}
