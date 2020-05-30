package tree;

import java.util.LinkedList;

/**
 *
 * G(n) = sum_{i= 1}^{n}{G(i−1)⋅G(n−i)}
 */

public class Problem_006_GenerateTrees {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int data) {
            this.val = data;
        }
    }

    public static LinkedList<TreeNode> generateTree(int start, int end){
        LinkedList<TreeNode> all_trees = new LinkedList<>();
        if(start > end){
            all_trees.add(null);
            return all_trees;
        }

        for (int i = start; i <= end ; i++) {
            LinkedList<TreeNode> left_trees = generateTree(start,i-1);
            LinkedList<TreeNode> right_trees = generateTree(i+1, end);

            for(TreeNode l:left_trees){
                for (TreeNode r:right_trees){
                    TreeNode current_tree = new TreeNode(i);
                    current_tree.left = l;
                    current_tree.right = r;
                    all_trees.add(current_tree);
                }
            }

        }

        return all_trees;
    }



    public static LinkedList<TreeNode> generateTree(int n) {
        if( n == 0){
            return new LinkedList<>();
        }
       return generateTree(1,n);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateTree(n));
    }
}
