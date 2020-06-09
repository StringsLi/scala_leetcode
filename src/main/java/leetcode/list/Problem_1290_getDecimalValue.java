package leetcode.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Problem_1290_getDecimalValue {

    public static  class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static int getDecimalValue(ListNode head){
        List<Integer> lst = new ArrayList<>();
        while (head != null){
            lst.add(head.val);
            head = head.next;
        }

        int size = lst.size();
        Iterator<Integer> it = lst.iterator();

        int sum = 0;
        int i = 1;
        while(it.hasNext()){
            sum += it.next() * Math.pow(2,size - i);
            i ++;
        }
        return sum;

    }


    public static int getDecimalValue2(ListNode head){
        ListNode curr = head;
        int sum = 0;
        while(curr != null){
            sum  = 2 * sum + curr.val;
            curr = curr.next;
        }
        return sum;

    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(0);
        node.next.next = new ListNode(0);

        System.out.println(getDecimalValue(node));
        System.out.println(getDecimalValue2(node));
//        System.out.println(middleNode(node).val);
    }
}
