package tree;


import java.util.LinkedList;
import java.util.List;

public class Problem_010_BinaryTreePaths {

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

    public static List<String> binaryTreePaths(TreeNode root) {
        LinkedList<String> paths = new LinkedList();
        buildPaths(root, "", paths);
        return paths;
    }

    public static void buildPaths(TreeNode root,String path,List<String> paths){
        if(root != null){
            path += Integer.toString(root.val);
            if((root.left == null) && (root.right == null)){
                paths.add(path);
            }
            path += "->";
            buildPaths(root.left,path,paths);
            buildPaths(root.right,path,paths);
        }
    }



    public static void main(String[] args) {
        TreeNode head = new TreeNode(4);
        head.left = new TreeNode(1);
        head.right = new TreeNode(7);
        head.right.left = new TreeNode(5);
        head.right.right = new TreeNode(8);

        System.out.println(binaryTreePaths(head));

    }
}
