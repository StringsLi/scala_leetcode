package leetcode.tree;


public class Problem_012_SumOfLeftLeaves {

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
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null){
            return 0;
        }else {
            if(root.left != null && root.left.right ==null && root.left.left ==null){
                sum += root.left.val;
            }
            sumOfLeftLeaves(root.left);
            sumOfLeftLeaves(root.right);
        }
        return sum;
    }



    public static void main(String[] args) {
        TreeNode head = new TreeNode(4);
        head.left = new TreeNode(1);
        head.right = new TreeNode(7);
        head.right.left = new TreeNode(5);
        head.right.right = new TreeNode(8);

        Problem_012_SumOfLeftLeaves solution = new Problem_012_SumOfLeftLeaves();
        System.out.println(solution.sumOfLeftLeaves(head));

    }
}
