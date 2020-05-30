package tree;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem_783_minDiffInBST {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int data) {
            this.val = data;
        }
    }

    /**
     * 基于递归的方法
     * @param root
     * @return
     */
    int min = Integer.MAX_VALUE;
    List<Integer> elem = new ArrayList<>();
    public int minDiffInBST(TreeNode root) {
        dfs(root);
        Collections.sort(elem);
        for (int i = 0; i < elem.size() -1; i++) {
            min = Math.min(min,elem.get(i+1) - elem.get(i));
        }
        return min;
    }

    public  void dfs(TreeNode root){
        if(root == null) return;
        elem.add(root.val);
        dfs(root.left);
        dfs(root.right);
    }



    public static void main(String[] args) {
        TreeNode head = new TreeNode(4);
        head.left = new TreeNode(1);
        head.right = new TreeNode(7);
        head.right.left = new TreeNode(5);
        head.right.right = new TreeNode(8);

        Problem_783_minDiffInBST solution = new Problem_783_minDiffInBST();
//        System.out.println(solution.dfs(head));
        System.out.println(solution.minDiffInBST(head));

    }
}
