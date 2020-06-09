package leetcode.list;

public class Problem_203_removeElements {

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

        public static ListNode removeElements(ListNode head, int val) {
            ListNode sentinel = new ListNode(0);
            sentinel.next = head;

            ListNode prev = sentinel, curr = head;
            while (curr != null) {
                if (curr.val == val) prev.next = curr.next;
                else prev = curr;
                curr = curr.next;
            }
            return sentinel.next;
        }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);

        ListNode rs = removeElements(head,2);

        print(rs);
    }


}
