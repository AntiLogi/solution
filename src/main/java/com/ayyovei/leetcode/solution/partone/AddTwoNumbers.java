package com.ayyovei.leetcode.solution.partone;

/**
 * @author chenxiaobin
 * @description Definition for singly-linked list.
 * @create 2018/8/3
 * Runtime: 29 ms
 * beats 27.70% of java submissions
 */

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = addTwoNumbers(l1, l2, 0);

        return listNode;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2,int carry) {
        ListNode nextForL1;
        ListNode nextForL2;
        int val1;
        int val2;
        if(l1==null && l2 == null){
            return null;
        }
        if (l1==null){
            nextForL1 = null;
            val1 = 0;
        }else {
            nextForL1 = l1.next;
            val1 = l1.val;
        }

        if (l2==null){
            nextForL2 = null;
            val2 = 0;
        }else {
            nextForL2 = l2.next;
            val2 = l2.val;
        }

        int sum = val1 + val2+ carry;
        if (sum>=10){
            carry = 1;

        }else {
            carry = 0;
        }
        sum = sum%10;
        ListNode listNode = new ListNode(sum);
        listNode.next = addTwoNumbers(nextForL1,nextForL2,carry);
        return listNode;
    }

    public void removeZeroNode(ListNode listNode){


    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new   ListNode(4);
        l1.next.next = new   ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new   ListNode(6);
        l2.next.next = new   ListNode(4);
        l2.next.next.next = new   ListNode(0);

        ListNode listNode = new AddTwoNumbers().addTwoNumbers(l1, l2);
        for (;;){
            if (listNode ==null){
                break;
            }
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}