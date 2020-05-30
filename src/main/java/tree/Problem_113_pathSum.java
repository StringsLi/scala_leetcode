package tree;

import java.util.ArrayList;
import java.util.List;

public class Problem_113_pathSum {

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

    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        if(root == null) return list;
        sum -= root.val;
        inner.add(root.val);

        if(root.left == null && root.right == null){
            if (sum == 0) list.add(new ArrayList<>(inner));
        }
        if(root.left != null) pathSum(root.left,sum);
        if(root.right != null) pathSum(root.right,sum);

        inner.remove(inner.size() -1);
        return list;
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode(5);
        head.left = new TreeNode(4);
        head.right = new TreeNode(8);
        head.left.left = new TreeNode(11);
        head.left.left.left = new TreeNode(7);
        head.left.left.right = new TreeNode(2);

        head.right.left = new TreeNode(13);
        head.right.right = new TreeNode(4);
        head.right.right.left = new TreeNode(5);
        head.right.right.right = new TreeNode(1);

        Problem_113_pathSum  pp = new Problem_113_pathSum();

        System.out.println(pp.pathSum(head,22));

    }



}
