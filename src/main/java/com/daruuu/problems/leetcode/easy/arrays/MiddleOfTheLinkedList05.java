package com.daruuu.LeetCode.leetcodeBeginnersGuide;

import com.daruuu.LeetCode.ListNode;

import java.util.ArrayList;

public class MiddleOfTheLinkedList05 {
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

    /**
     * Finds the middle node of a singly linked list using the fast and slow pointer technique.
     * <p>
     * - slowPointer moves one step at a time
     * - fastPointer moves two steps at a time
     * - slowPointer will be at the middle when fastPointer reaches the end
     * <p>
     * Time complexity: O(n) - we traverse the list once
     * Space complexity: O(1) - only two pointers are used
     *
     * @param head the head node of the linked list
     * @return the middle node; if there are two middles, returns the second one
     */
    public static ListNode middleNodeImprove(ListNode head) {
        if (head == null)
            return null;

        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;          // move by 1
            fastPointer = fastPointer.next.next;     // move by 2
        }

        return slowPointer;
    }

    /**
     * This version we use arraylist to be more effient BUT we are no using a linkedList :(
     * Returns the middle node of a singly linked list.
     * <p>
     * If the list has an odd number of nodes, the exact middle is returned.
     * If the list has an even number of nodes, the second of the two middle nodes is returned.
     * <p>
     * This implementation uses an ArrayList to store references
     * to each node while traversing the linked list. Once all nodes
     * are collected, it simply returns the node at index length / 2.
     * <p>
     * Example 1:
     * Input:  1 -> 2 -> 3 -> 4 -> 5
     * Output: Node with value 3
     * <p>
     * Example 2:
     * Input:  1 -> 2 -> 3 -> 4 -> 5 -> 6
     * Output: Node with value 4
     * <p>
     * Time Complexity: O(n)
     * - One traversal of the list to build the array.
     * <p>
     * Space Complexity: O(n)
     * - Stores all nodes in an ArrayList.
     *
     * @param head the head of the singly linked list (cannot be null)
     * @return the middle node of the list
     */

    public static ListNode middleNodeWithArrayList(ListNode head) {

        ArrayList<ListNode> array = new ArrayList<>();
        int length = 0;

        while (head != null) {
            array.add(head);
            head = head.next;
            length++;
        }
        return (array.get(length / 2));
    }
}
