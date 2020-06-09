package leetcode.tree;

public class Problem_001_BalancedTree {

    public static class TreeNode {
        public int value;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int data) {
            this.value = data;
        }
    }

    public static boolean isBalance(TreeNode root) {
        return depth(root) != -1;
    }

    public static int depth(TreeNode root){
        if(root == null) {
            return 0;
        }
        int left = depth(root.left);
        if(left == -1) return -1;
        int right = depth(root.right);
        if(right == -1) return  -1;
        return Math.abs(left - right) < 2 ? Math.max(left,right) + 1:-1;
    }



    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(9);
        head.right = new TreeNode(20);
        head.right.left = new TreeNode(15);
        head.right.right = new TreeNode(7);
        System.out.println(isBalance(head));
    }
}
