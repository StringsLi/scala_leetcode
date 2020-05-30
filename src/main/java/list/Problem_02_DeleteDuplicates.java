package list;

public class Problem_02_DeleteDuplicates {
    public static  class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode deleteDuplicates(ListNode head){
        ListNode current = head;
        while(current != null && current.next != null){
             if(current.val == current.next.val){
                current.next = current.next.next;
            }else {
                 current = current.next;
             }
        }
        return head;
    }


    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(5);
        node.next.next.next = new ListNode(4);



    }
}
