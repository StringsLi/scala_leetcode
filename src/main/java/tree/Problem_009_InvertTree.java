package tree;


import java.util.LinkedList;
import java.util.Queue;

public class Problem_009_InvertTree {

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

    public static TreeNode invertTree(TreeNode root) {
       if(root == null){
           return  null;
       }
       TreeNode left = invertTree(root.left);
       TreeNode right = invertTree(root.right);
       root.left = right;
       root.right = left;
       return root;
    }

    /**
     * 基于迭代的方法
     * 我们需要交换树中所有节点的左孩子和右孩子。因此可以创一个队列来存储所有
     * 左孩子和右孩子还没有被交换过的节点。开始的时候，只有根节点在这个队列里面
     * 。只要这个队列不空，就一直从队列中出队节点，然后互换这个节点的左右孩子节点，
     * 接着再把孩子节点入队到队列，对于其中的空节点不需要加入队列。最终队列一定会空，
     * 这时候所有节点的孩子节点都被互换过了，直接返回最初的根节点就可以了

     * @param root
     * @return
     */
    public static TreeNode invertTree2(TreeNode root) {
        if(root == null){
            return  null;
        }
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode current = queue.poll();
            TreeNode tmp = current.left;
            current.left = current.right;
            current.right = tmp;
            if(current.left != null) queue.add(current.left);
            if(current.right != null) queue.add(current.right);
        }

        return root;
    }





    public static void main(String[] args) {
        TreeNode head = new TreeNode(4);
        head.left = new TreeNode(1);
        head.right = new TreeNode(7);
        head.right.left = new TreeNode(5);
        head.right.right = new TreeNode(8);

        System.out.println(invertTree2(head).left.val);

    }
}
