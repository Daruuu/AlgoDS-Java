package com.daruuu.LeetCode;

public class ListNode {

    int val;
    ListNode    next;

    ListNode(){ }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    /*
    2. Add Two Numbers
    Companies
    You are given two non-empty linked lists representing two non-negative integers.
    The digits are stored in reverse order, and each of their nodes contains a single digit.
    Add the two numbers and return the sum as a linked list.
    You may assume the two numbers do not contain any leading zero, except the number 0 itself.
    Example 1:
        Input: l1 = [2,4,3], l2 = [5,6,4]
        Output: [7,0,8]
        Explanation: 342 + 465 = 807.
    Example 2:
        Input: l1 = [0], l2 = [0]
        Output: [0]
    Example 3:
        Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
        Output: [8,9,9,9,0,0,0,1]
    Constraints:
        The number of nodes in each linked list is in the range [1, 100].
        0 <= Node.val <= 9
        It is guaranteed that the list represents a number that does not have leading zeros.
     */
    //  1. iterar por l1 y l2 hasta el final
    //  2.
    public static ListNode    addTwoNumbers(ListNode l1, ListNode l2)
    {
        //  nodo ficticio que apunta al primer nodo del resultado
        ListNode    headResult = new ListNode(0);
        ListNode    currentNode = headResult;

        //  variable que lleva el resto de las sumas
        int         carry = 0;

//        Example 1:
//        Input: l1 = [2,4,3], l2 = [5,6,4]
//        Output: [7,0,8]
//        Explanation: 342 + 465 = 807.

        while (l1 != null || l2 != null || carry != 0)
        {
            int valor1 = (l1 != null) ? l1.val : 0;
            int valor2 = (l2 != null) ? l2.val : 0;

            int sum = valor1 + valor2 + carry;
            carry = sum / 10;
            currentNode.next = new ListNode(sum % 10);
            currentNode = currentNode.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        return (headResult.next);
    }

}
