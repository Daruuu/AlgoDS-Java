package com.daruuu.LeetCode.beginnerchallengeproblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RichestCustomerWealth02Test {

    @Test
    void maximumWealth() {
        //  given
        int[][] accountsInput = {
                {1,2,3},
                {3,2,1}
        };
        int expectedOutput = 6;

        //  when
        int result = RichestCustomerWealth02.maximumWealth(accountsInput);

        //  then
        assertEquals(expectedOutput ,result);
    }

    @Test
    void shouldReturnSum_whenOnlyOneCustomer() {
        int[][] accounts = {
                {10, 20, 30}
        };
        int expected = 60;
        assertEquals(expected, RichestCustomerWealth02.maximumWealth(accounts));
    }

    @Test
    void shouldReturnCorrectSum_whenCustomerHasOneAccount() {
        int[][] accounts = {
                {99},
                {1, 1}
        };
        int expected = 99;
        assertEquals(expected, RichestCustomerWealth02.maximumWealth(accounts));
    }

    @Test
    void shouldReturnZero_whenAllAccountsAreZero() {
        int[][] accounts = {
                {0, 0},
                {0, 0}
        };
        int expected = 0;
        assertEquals(expected, RichestCustomerWealth02.maximumWealth(accounts));
    }

}