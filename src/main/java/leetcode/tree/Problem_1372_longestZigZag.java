package leetcode.tree;

public class Problem_1372_longestZigZag {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int data) {
            this.val = data;
        }
    }
    private int max = 0;

    public int longestZigZag(TreeNode root) {
        move(root);
        return max - 1;
    }

    // 0:left, 1:right
    private int[] move(TreeNode curr) {
        if (curr == null) return new int[2];
        int[] l = move(curr.left), r = move(curr.right), res = {l[1] + 1, r[0] + 1};
        max = Math.max(max, Math.max(res[0], res[1]));
        return res;
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        head.right = new TreeNode(1);
        head.left = new TreeNode(1);
        head.left.right = new TreeNode(1);
        head.left.right.left = new TreeNode(1);

        head.left.right.right = new TreeNode(1);
        head.left.right.left.right = new TreeNode(1);

        Problem_1372_longestZigZag lz = new Problem_1372_longestZigZag();
        int res = lz.longestZigZag(head);
        System.out.println(res);

    }


}
