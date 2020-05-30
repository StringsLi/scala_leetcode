package tree;

public class Problem_538_convertBST {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int data) {
            this.val = data;
        }
    }

    private int sum = 0;

    public TreeNode convertBST(TreeNode root){
        if(root == null) {
            return null;
        }
        else {
            convertBST(root.right);
            sum += root.val;
            root.val = sum;
            convertBST(root.left);
        }

        return root;
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode(4);
        head.left = new TreeNode(1);
        head.right = new TreeNode(7);

        Problem_538_convertBST pc = new Problem_538_convertBST();
        TreeNode root = pc.convertBST(head);
        System.out.println(root.val);
        System.out.println(root.left.val);
        System.out.println(root.right.val);

    }

}
