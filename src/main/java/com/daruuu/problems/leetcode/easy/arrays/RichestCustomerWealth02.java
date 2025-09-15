package com.daruuu.LeetCode.leetcodeBeginnersGuide;

public class RichestCustomerWealth02 {
    /*
    https://leetcode.com/problems/richest-customer-wealth/description/
    1672. Richest Customer Wealth
    Easy
    You are given an m x n integer grid accounts where accounts[i][j] is the amount
    of money the i(th) customer has in the j(th) bank.

    Return the wealth that the richest customer has.

    A customer's wealth is the amount of money they have in all their bank accounts.
    The richest customer is the customer that has the maximum wealth.

    Example 1:
        Input: accounts = [[1,2,3],[3,2,1]]
        Output: 6
        Explanation:
            1st customer has wealth = 1 + 2 + 3 = 6
            2nd customer has wealth = 3 + 2 + 1 = 6
            Both customers are considered the richest with a wealth of 6 each, so return 6.
    Example 2:
        Input: accounts = [[1,5],[7,3],[3,5]]
        Output: 10
        Explanation:
            1st customer has wealth = 6
            2nd customer has wealth = 10
            3rd customer has wealth = 8
            The 2nd customer is the richest with a wealth of 10.
    Example 3:
        Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
        Output: 17

    Constraints:
        m == accounts.length
        n == accounts[i].length
        1 <= m, n <= 50
        1 <= accounts[i][j] <= 100
     */
    public static int maximumWealth(int[][] accounts) {
        if (accounts[0].length == 0)
            return (-1);

        int currentCustomerWealth;
        int maxWealthSoFar = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            currentCustomerWealth = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                currentCustomerWealth += accounts[i][j];
            }
            if (currentCustomerWealth > maxWealthSoFar)
                maxWealthSoFar = currentCustomerWealth;
        }
        return (maxWealthSoFar);
    }

    /**
     * Time Complexity: O(n * m)
     * - n = number of customers (rows in the matrix)
     * - m = number of bank accounts per customer (columns)
     * We must visit each account once.
     * <p>
     * Space Complexity: O(1) is constant
     * - Only uses a few integer variables regardless of input size.
     *
     * @param accounts 2D array where accounts[i][j] is the amount of money
     *                 customer i has in the j-th bank.
     * @return the maximum total wealth of any customer
     */
    public static int maximumWealthImproved(int[][] accounts) {

        int maxWealthSoFar = Integer.MIN_VALUE;
        for (int[] customer : accounts) {
            int currentCustomerWealth = 0;

            for (int bank : customer) {
                currentCustomerWealth += bank;
            }
            maxWealthSoFar = Math.max(maxWealthSoFar, currentCustomerWealth);
        }
        return (maxWealthSoFar);
    }
}
