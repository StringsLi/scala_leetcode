package list;

public class Problem_876_middleNode {
    public static  class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode middleNode1(ListNode head){
        ListNode[] listNodes = new ListNode[100];
        int i = 0;
        while (head != null){
            listNodes[i++] = head;
            head = head.next;
        }
        return listNodes[i/2];
    }

    public static ListNode middleNode(ListNode head){
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }



    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(1);

        System.out.println(middleNode(node).val);
    }

}
