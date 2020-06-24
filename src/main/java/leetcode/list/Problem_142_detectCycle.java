package leetcode.list;

import java.util.HashSet;
import java.util.Set;

public class Problem_142_detectCycle {

    public static  class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static ListNode detectCycle(ListNode head){
        Set<ListNode> nodeSet = new HashSet<>();
        ListNode node = head;
        while (node != null){
            if(nodeSet.contains(node)){
                return node;
            }
            nodeSet.add(node);
            node = node.next;
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(1);
    }
}
