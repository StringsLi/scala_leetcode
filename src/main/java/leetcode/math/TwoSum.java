package leetcode.math;

public class TwoSum {

    public static void main(String[] args) {
        ListNode ln1 = new ListNode(2);
        ln1.next = new ListNode(3);
        ln1.next.next = new ListNode(4);


        ListNode ln2 = new ListNode(3);
        ln2.next = new ListNode(4);
        ln2.next.next = new ListNode(6);

        System.out.println(addTwoNumbers(ln1,ln2));

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

}

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
