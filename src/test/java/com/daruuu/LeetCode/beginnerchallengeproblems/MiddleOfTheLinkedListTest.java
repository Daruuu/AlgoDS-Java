package com.daruuu.LeetCode.beginnerchallengeproblems;

import com.daruuu.LeetCode.ListNode;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MiddleOfTheLinkedListTest {

    @Test
    void should_show_the_lenght_of_linkedList() {
        //  given

        ListNode listToTest = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, null))))));
        ListNode expectedListResult = new ListNode(4, new ListNode(5, new ListNode(6, null)));

        //  when
        ListNode result = MiddleOfTheLinkedList.middleNode(listToTest);
        //  then
        assertEquals(expectedListResult.toString(), result.toString());
    }
}