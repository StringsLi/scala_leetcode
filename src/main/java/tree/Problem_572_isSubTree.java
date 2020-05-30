package tree;

public class Problem_572_isSubTree {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int data) {
            this.val = data;
        }
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode(3);
        head.left = new TreeNode(4);
        head.right = new TreeNode(5);
        head.left.left = new TreeNode(1);
        head.left.right = new TreeNode(2);

        TreeNode head2 = new TreeNode(4);
        head2.left = new TreeNode(1);
        head2.right = new TreeNode(2);

        Problem_572_isSubTree ps = new Problem_572_isSubTree();
        System.out.println(ps.isSubtree(head,head2));

    }

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(t == null) return true;
        if(s == null) return false;
        if(s.val != t.val){
            return isSubtree(s.left,t) || isSubtree(s.right,t);
        }else{
            return isSameTree(s,t) || isSubtree(s.left,t) || isSubtree(s.right,t);
        }
    }


    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val == q.val){
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }
        return false;
    }

}
