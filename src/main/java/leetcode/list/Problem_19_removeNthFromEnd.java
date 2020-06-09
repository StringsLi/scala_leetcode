package leetcode.list;

/**
 * 本题是一个经典的双指针问题。解题思路如下。
 *    1、新建一个新链表res，并让res的next指针指向head。并新建fast和slow，他们均指向res。
 *    2、将fast往后移n个距离。
 *    3、同时移动fast和slow，直到fast.next == null为止。
 *    4、此时slow为倒数第n个节点的前一个节点。slow.next = slow.next.next就可以将倒数第n个节点移除。
 */

public class Problem_19_removeNthFromEnd {
    public static  class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res = new ListNode(-1);
        res.next = head;
        ListNode fast = res;
        ListNode slow = res;

        while (n-- > 0){
            fast = fast.next;
        }

        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return res.next;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);

        System.out.println(removeNthFromEnd(node,2));
    }
}
