package leetcode.tree;

public class Problem_437_PathSumIII {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int data) {
            this.val = data;
        }
    }

    private static int findPaths(TreeNode node, int sum) {
        if (node == null) {
            return 0;
        }
        int res = 0;
        if (node.val == sum) {
            res++;
        }
        res += findPaths(node.left, sum - node.val);
        res += findPaths(node.right, sum - node.val);
        return res;
    }

    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        return findPaths(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode(4);
        head.left = new TreeNode(1);
        head.right = new TreeNode(7);

        System.out.println(findPaths(head,5));
    }
}
