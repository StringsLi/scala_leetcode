package tree;

public class Problem_251_lowestCommonAncestor {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int data) {
            this.val = data;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int parentVal = root.val;
        int pVal = p.val;
        int qVal = q.val;

        if(pVal > parentVal && qVal > parentVal){
            return lowestCommonAncestor(root.right,p,q);
        }else if(pVal < parentVal && qVal < parentVal){
            return lowestCommonAncestor(root.left,p,q);
        }else {
            return root;
        }
    }
}
