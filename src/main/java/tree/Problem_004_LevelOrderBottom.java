package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem_004_LevelOrderBottom {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int data) {
            this.val = data;
        }
    }

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> result = new LinkedList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int cnt = queue.size();
            List<Integer> levels = new ArrayList<>();
            for (int i = 0; i < cnt; i++) {
                TreeNode node = queue.poll();
                levels.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            result.addFirst(levels);
        }

        return result;
    }


    /**
     * 时间复杂度O(n)
     * 空间复杂度O(n)
     *
     * 整体思路和自定的二叉树层次遍历相同，
     * 唯一区别在于：遍历完每一层时，放入结果集时采用头插入addFirst
     * 这样输出结果集时，底层在上。
     * @param root 根节点
     * @return 层次遍历结果
     */
    public static List<List<Integer>> levelOrderBottom2(TreeNode root) {
        LinkedList<List<Integer>> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            LinkedList<Integer> levels = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                levels.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            //区别点：头插入
            result.addFirst(levels);
        }
        return result;
    }



    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(9);
        head.right = new TreeNode(20);
        head.right.left = new TreeNode(15);
        head.right.right = new TreeNode(7);
        System.out.println(levelOrderBottom(head));
    }
}
