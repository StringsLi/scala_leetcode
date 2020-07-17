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

    public ListNode detectCycle2(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast){
                break;
            }
        }
        if(fast == null || fast.next == null){
            return null;
        }
        slow = head;
        while(slow != fast){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;

    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(1);
    }
}
