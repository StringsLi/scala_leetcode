package leetcode.tree;

public class Problem_124_maxPathSum {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int data) {
            this.val = data;
        }
    }

    int max_sum = Integer.MIN_VALUE;

    public int max_gain(TreeNode node) {
        if (node == null) return 0;

        int left_gain = Math.max(max_gain(node.left), 0);
        int right_gain = Math.max(max_gain(node.right), 0);

        int price_newpath = node.val + left_gain + right_gain;
        max_sum = Math.max(max_sum, price_newpath);

        return node.val + Math.max(left_gain, right_gain);
    }

    public int maxPathSum(TreeNode root) {
//        max_gain(root);
        helper(root);
        return max_sum;
    }

    private int helper(TreeNode root) {
        if (root == null) return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        max_sum = Math.max(left + right + root.val, max_sum);
        return Math.max(0, Math.max(left, right) + root.val);
    }



    public static void main(String[] args) {
        TreeNode head = new TreeNode(-10);
        head.left = new TreeNode(9);
        head.right = new TreeNode(20);
        head.right.left = new TreeNode(15);
        head.right.right = new TreeNode(7);

        Problem_124_maxPathSum pm = new Problem_124_maxPathSum();

        System.out.println(pm.maxPathSum(head));

    }
}

