package tree;

public class Problem_700_searchBST {

    public static class TreeNode {
        public int value;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int data) {
            this.value = data;
        }
    }

    public TreeNode searchBST(TreeNode root, int val){
        if(root != null) {
            if (root.value == val) {
                return root;
            } else if (root.value < val) {
                return searchBST(root.right, val);
            } else {
                return searchBST(root.left, val);
            }
        }
        return null;
    }



    public static void main(String[] args) {
        TreeNode head = new TreeNode(4);
        head.left = new TreeNode(2);
        head.right = new TreeNode(7);
        head.left.left = new TreeNode(1);
        head.left.right = new TreeNode(3);

        Problem_700_searchBST solution = new Problem_700_searchBST();
        System.out.println(solution.searchBST(head,2).value);
    }
}
