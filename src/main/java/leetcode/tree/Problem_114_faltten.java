package leetcode.tree;

public class Problem_114_faltten {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int data) {
            this.val = data;
        }
    }

    public void flatten(TreeNode root){
        while (root != null){
            if(root.left == null){
                root = root.right;
            }else{
                TreeNode pre = root.left;
                while (pre.right != null){
                    pre = pre.right;
                }

                pre.right = root.right;
                root.right = root.left;
                root.left = null;

                root = root.right;
            }
        }
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(2);
        head.right = new TreeNode(5);
        head.right.right = new TreeNode(6);
        head.left.left = new TreeNode(3);
        head.left.right = new TreeNode(4);

        Problem_114_faltten pf = new Problem_114_faltten();

        pf.flatten(head);

        System.out.println(head.right.right.right.val);
    }
}
