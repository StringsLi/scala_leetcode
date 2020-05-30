package tree;

public class Problem_1022_sumRootToLeafII {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int data) {
            this.val = data;
        }
    }

    public int sumRootToLeaf(TreeNode root){
        return sumNode(root,0);
    }

    public int sumNode(TreeNode node,int sum) {

        if(node == null) return 0;
        if(node.left == null && node.right == null){
            return 2 * sum + node.val;
        }
        return sumNode(node.left,2 * sum + node.val) +sumNode(node.right,2 * sum + node.val);
    }


    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(0);
        head.right = new TreeNode(1);

        Problem_1022_sumRootToLeafII pp = new Problem_1022_sumRootToLeafII();
        System.out.println(pp.sumRootToLeaf(head));

    }



}
