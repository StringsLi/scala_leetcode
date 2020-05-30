package tree;

public class Problem_002_MinDepth {

    public static class TreeNode {
        public int value;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int data) {
            this.value = data;
        }
    }

    public static int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        int mindepth = Integer.MAX_VALUE;
        if(root.left !=null){
            mindepth = Math.min(minDepth(root.left),mindepth);
        }
        if(root.right !=null){
            mindepth = Math.min(minDepth(root.right),mindepth);
        }

        return mindepth + 1;
    }



    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(9);
        head.right = new TreeNode(20);
        head.right.left = new TreeNode(15);
        head.right.right = new TreeNode(7);
        System.out.println(minDepth(head));
    }
}
