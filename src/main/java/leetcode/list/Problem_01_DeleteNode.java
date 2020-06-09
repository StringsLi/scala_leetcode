package leetcode.list;

public class Problem_01_DeleteNode {
    public static  class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void deleteNode(ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;
//        return node;
    }
    public static void  print(ListNode node){
        ListNode current = node;
        while (current != null){
            System.out.println(current.val + ",");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        print(node);
        deleteNode(node);
        print(node);

    }
}
