package com.daruuu.LeetCode.beginnerchallengeproblems;

import com.daruuu.LeetCode.ListNode;

public class MiddleOfTheLinkedList {
    /*
    https://leetcode.com/problems/middle-of-the-linked-list/description/
    876. Middle of the Linked List
    Easy
    Topics
    Companies
    Given the head of a singly linked list, return the middle node of the linked list.

    If there are two middle nodes, return the second middle node.

    Example 1:
        1   ->  2   ->  [3] ->  4   ->  5
    Input: head = [1,2,3,4,5]
    Output: [3,4,5]
    Explanation: The middle node of the list is node 3.

    Example 2:
        1   ->  2   ->  3   ->  [4] ->  5   ->  6
    Input: head = [1,2,3,4,5,6]
    Output: [4,5,6]
    Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.

    Constraints:

    The number of nodes in the list is in the range [1, 100].
    1 <= Node.val <= 100
     */

    public static ListNode middleNode(ListNode head) {
        if (head == null)
            return (null);

        ListNode currNode = head;
        int length = 0;

        while (currNode != null) {
            currNode = currNode.next;
            length++;
        }
        currNode = head;
        int mid = (length / 2);

        int j = 0;
        for (int i = 0; i < mid; i++) {
            currNode = currNode.next;
        }
        return (currNode);
    }

}
