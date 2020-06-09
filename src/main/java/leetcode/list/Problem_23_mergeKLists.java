package leetcode.list;

import java.util.PriorityQueue;

public class Problem_23_mergeKLists {

    public static  class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        PriorityQueue<ListNode> queue = new PriorityQueue<>((o1, o2) -> {
            if(o1.val < o2.val){
                return -1;
            }else if(o1.val > o2.val){
                return 1;
            }else {
                return 0;
            }
        });

        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        for(ListNode node:lists){
            if(node != null){
                queue.add(node);
            }
        }

        while (!queue.isEmpty()){
            p.next = queue.poll();
            p = p.next;
            if(p.next != null){
                queue.add(p.next);
            }
        }
        return dummy.next;
    }
}
