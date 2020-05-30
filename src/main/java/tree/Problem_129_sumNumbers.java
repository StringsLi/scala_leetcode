package tree;

import java.util.ArrayList;
import java.util.List;

public class Problem_129_sumNumbers {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int data) {
            this.val = data;
        }
    }

    List<List<Integer>> list = new ArrayList<>();
    List<Integer> inner = new ArrayList<>();

    public int sumNumbers(TreeNode root) {

        if(root == null) return 0;
        inner.add(root.val);

        if(root.left == null && root.right == null){
            list.add(new ArrayList<>(inner));
        }
        if(root.left != null) sumNumbers(root.left);
        if(root.right != null) sumNumbers(root.right);
        inner.remove(inner.size() -1);
//        return list;
        int sum = 0;
        for (int i = 0; i < list.size() ; i++) {
            int numi = list2Int(list.get(i));
            sum += numi;
        }
        return sum;
    }

    public static int list2Int(List<Integer> list){
        int res = 0;
        for (int i = 0; i < list.size() ; i++) {
            res += list.get(i) * Math.pow(10,list.size() - i - 1);
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(2);
        head.right = new TreeNode(3);
//        head.left.left = new TreeNode(11);
//        head.left.left.left = new TreeNode(7);
//        head.left.left.right = new TreeNode(2);
//
//        head.right.left = new TreeNode(13);
//        head.right.right = new TreeNode(4);
//        head.right.right.left = new TreeNode(5);
//        head.right.right.right = new TreeNode(1);

        Problem_129_sumNumbers pp = new Problem_129_sumNumbers();

        System.out.println(pp.sumNumbers(head));

    }



}
