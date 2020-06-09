package leetcode.tree;


public class Problem_013_DiameterOfBinaryTree {

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
    int ans;
    public int diameterOfBinaryTree(TreeNode root) {
        ans = 1;
        depth(root);
        return ans -1;
    }

    public int depth(TreeNode root){
        if(root == null) return 0;
        int left = depth(root.left);
        int right = depth(root.right);
        ans = Math.max(ans,left + right + 1);
        return Math.max(left,right) + 1;

    }



    public static void main(String[] args) {
        TreeNode head = new TreeNode(4);
        head.left = new TreeNode(1);
        head.right = new TreeNode(7);
        head.right.left = new TreeNode(5);
        head.right.right = new TreeNode(8);

        Problem_013_DiameterOfBinaryTree solution = new Problem_013_DiameterOfBinaryTree();
        System.out.println(solution.diameterOfBinaryTree(head));
        System.out.println(solution.depth(head));

    }
}
