package tree;

public class Problem_530_getMinimumDifference {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int data) {
            this.val = data;
        }
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        head.right = new TreeNode(3);
        head.right.left = new TreeNode(2);
        Problem_530_getMinimumDifference sl = new Problem_530_getMinimumDifference();
        System.out.println(sl.getMinimumDifference(head));
    }

    int min = Integer.MAX_VALUE;
    TreeNode pre = null;

    public int getMinimumDifference(TreeNode root){
        inOrder(root);
        return min;
    }

    public void inOrder(TreeNode root){
        if(root == null) return;
        inOrder(root.left);
        if(pre!=null){
            min = Math.min(min,root.val - pre.val);
        }
        pre = root;
        inOrder(root.right);
    }
}
