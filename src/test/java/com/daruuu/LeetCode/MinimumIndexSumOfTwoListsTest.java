package com.daruuu.LeetCode;

import com.daruuu.LeetCode.array.MinimumIndexSumOfTwoLists;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumIndexSumOfTwoListsTest {

    @Test
    void    findRestaurant() {
        String[]    list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[]    list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        String[]    expectedOutput = {"Shogun"};

        String[]    result = MinimumIndexSumOfTwoLists.findRestaurant(list1, list2);

        assertArrayEquals(expectedOutput, result);

    }
}