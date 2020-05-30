package list;

public class Problem_21_mergeTwoLists {

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

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }else {
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(5);

        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(3);
        node1.next.next = new ListNode(3);

        ListNode ln = mergeTwoLists(node1,node);

        print(ln);


    }

}
