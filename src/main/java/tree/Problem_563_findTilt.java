package tree;

public class Problem_563_findTilt {

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
        head.left = new TreeNode(2);
        head.right = new TreeNode(3);

        Problem_563_findTilt sl = new Problem_563_findTilt();
        System.out.println(sl.findTilt(head));

    }
    int titl = 0;

    public int findTilt(TreeNode root) {
        traverval(root);
        return titl;
    }

    public int traverval(TreeNode root){
        if (root == null) return 0;
        int left =  traverval(root.left);
        int right =  traverval(root.right);
        titl += Math.abs(left - right);

        return left + right + root.val;
    }
}

