package com.strings.offer;

import java.util.Deque;
import java.util.LinkedList;

public class Problem_33_verifyPostorderJ {

    public boolean verifyPostorder2(int[] postorder) {
        return recur(postorder, 0, postorder.length - 1);
    }
    boolean recur(int[] postorder, int i, int j) {
        if(i >= j) return true;
        int p = i;
        while(postorder[p] < postorder[j]) p++;
        int m = p;
        while(postorder[p] > postorder[j]) p++;
        return p == j && recur(postorder, i, m - 1) && recur(postorder, m, j - 1);
    }



    public boolean verifyPostorder(int[] postorder) {
        Deque<Integer> stack = new LinkedList<>();
        int pervElem = Integer.MAX_VALUE;
        for (int i = postorder.length - 1; i >= 0; i--) {
            if (postorder[i] > pervElem) {
                return false;
            }
            while (!stack.isEmpty() && postorder[i] < stack.peek()) {
                pervElem = stack.pop();
            }
            stack.push(postorder[i]);
        }
        return true;

    }

    public static void main(String[] args) {
        Problem_33_verifyPostorderJ obj = new Problem_33_verifyPostorderJ();
        int[] nums = {1, 2, 5, 10, 6, 9, 4, 3};
        System.out.println(obj.verifyPostorder(nums));
    }

}
