package list;

import java.util.HashSet;
import java.util.Set;

public class Problem_160_getIntersectionNode {

    public static  class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void print(ListNode l){
        while (l != null){
            if(l.next == null){
                System.out.print(l.val);
            }else{
                System.out.print(l.val  + "-->");
            }
            l = l.next;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currA = headA, currB = headB;
        Set<ListNode> setsNode = new HashSet<>();
        while (currA != null){
            setsNode.add(currA);
            currA = currA.next;
        }

        while (currB != null){
            if(setsNode.contains(currB)){
                return  currB;
            }
            currB = currB.next;
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(1);

        ListNode node2 = new ListNode(3);
        node2.next = new ListNode(2);
        node2.next.next = new ListNode(1);

        ListNode rs = getIntersectionNode(node,node2);
        print(rs);

    }

}
