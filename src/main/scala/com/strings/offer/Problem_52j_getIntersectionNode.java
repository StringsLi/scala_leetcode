package com.strings.offer;

public class Problem_52j_getIntersectionNode {
   static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode node1 = headA;
        ListNode node2 = headB;
        while (node1 != node2){
            node1 = node1 != null? node1.next:headB;
            node2 = node2 != null? node1.next:headA;
        }
        return node1;
    }
}
