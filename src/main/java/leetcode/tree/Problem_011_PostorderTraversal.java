package leetcode.tree;


import java.util.LinkedList;
import java.util.List;

public class Problem_011_PostorderTraversal {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int data) {
            this.val = data;
        }
    }

    /**
     * 基于递归的方法
     * @param root
     * @return
     */

    public static List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList();
        LinkedList<Integer> res = new LinkedList<>();

        if(root == null){
            return res;
        }

        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pollLast();
            res.addFirst(node.val);

            if(node.left != null){
                stack.add(node.left);
            }
            if(node.right != null){
                stack.add(node.right);
            }
        }
        return res;
    }


    public static void main(String[] args) {
        TreeNode head = new TreeNode(4);
        head.left = new TreeNode(1);
        head.right = new TreeNode(7);
        head.right.left = new TreeNode(5);
        head.right.right = new TreeNode(8);

        System.out.println(postorderTraversal(head));

    }
}
