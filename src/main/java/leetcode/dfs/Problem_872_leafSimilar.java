package leetcode.dfs;

import java.util.ArrayList;
import java.util.List;

public class Problem_872_leafSimilar {

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


        TreeNode head2 = new TreeNode(1);
        head2.left = new TreeNode(4);
        head2.right = new TreeNode(5);

        Problem_872_leafSimilar ps = new Problem_872_leafSimilar();
        System.out.println(ps.leafSimilar(head,head2));

    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leav1 = new ArrayList<>();
        List<Integer> leav2 = new ArrayList<>();
        leafTrace(root1,leav1);
        leafTrace(root2,leav2);
        return leav1.equals(leav2);
    }

    public void leafTrace(TreeNode root, List<Integer> leafValues){
        if(root != null){
            if(root.left == null && root.right == null){
                leafValues.add(root.val);
            }
            leafTrace(root.left,leafValues);
            leafTrace(root.right,leafValues);
        }
    }

}
