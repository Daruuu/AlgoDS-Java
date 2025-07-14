package com.daruuu.LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeTest {

    @Test
    void    shouldReturnTheReverseSumOfLinkedList_whenListNotNull() {
//        Example 1:
        ListNode    list1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode    list2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode    expectedResult = new ListNode(7, new ListNode(0, new ListNode(8)));
//        Explanation: 342 + 465 = 807.

        ListNode    result = ListNode.addTwoNumbers(list1, list2);

        assertTrue(compareLists(expectedResult, result));
    }

    public static boolean compareLists(ListNode l1, ListNode l2)
    {
        while (l1 != null && l2 != null)
        {
            if (l1.val != l2.val)
                return (false);
            l1 = l1.next;
            l2 = l2.next;
        }
        return (l1 == null && l2 == null);
    }
}