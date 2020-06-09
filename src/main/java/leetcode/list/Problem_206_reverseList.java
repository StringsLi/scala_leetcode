package leetcode.list;

public class Problem_206_reverseList {

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

    public static ListNode reverseList(ListNode head){
        ListNode  prev = null;
        ListNode curr = head;
        while (curr != null){
            ListNode nextTmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTmp;
        }

        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        ListNode rs = reverseList(head);
        print(rs);
    }
}
