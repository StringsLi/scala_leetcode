package list;

import java.util.HashSet;
import java.util.Set;

public class Problem_141_hasCycle {

    public static  class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static boolean hasCycle(ListNode head){
        Set<ListNode> nodeSet = new HashSet<>();
        while (head != null){
            if(nodeSet.contains(head)){
                return true;
            }else {
                nodeSet.add(head);
            }
            head = head.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(1);
    }
}
