package tree;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem_008_ZigzagLevelOrder {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int data) {
            this.val = data;
        }
    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        LinkedList<List<Integer>> res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int flag = 0; //偶数为 左到右
        while (!queue.isEmpty()) {
            int size = queue.size();
            LinkedList<Integer> levels = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if((flag % 2) == 1){
                    levels.addFirst(node.val);
                }else{
                    levels.addLast(node.val);
                }

                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            //区别点：头插入
            res.add(levels);
            flag++;
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode(4);
        head.left = new TreeNode(1);
        head.right = new TreeNode(7);
        head.right.left = new TreeNode(5);
        head.right.right = new TreeNode(8);

        System.out.println(zigzagLevelOrder(head));

    }
}
