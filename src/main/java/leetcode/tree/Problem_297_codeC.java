package leetcode.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem_297_codeC {

    public static void main(String[] args) {
        TreeNode head = new TreeNode(4);
        head.left = new TreeNode(1);
        head.right = new TreeNode(7);

        Problem_297_codeC codeC = new Problem_297_codeC();
        String str = codeC.serialize(head);
        System.out.println(str);

        TreeNode ll = codeC.deserialize(str);
        System.out.println(ll.val);

    }

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int data) {
            this.val = data;
        }
    }

    public String rserialize(TreeNode root, String str) {
        if(root == null){
            str += "null,";
        }else{
            str += root.val +",";
            str = rserialize(root.left, str);
            str = rserialize(root.right,str);
        }
        return str;
    }


    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        return rserialize(root,"");
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        List<String> lst = new ArrayList<>(Arrays.asList(data.split(",")));
        return rdeserialize(lst);
    }

    public TreeNode rdeserialize(List<String> lst) {
        if(lst.get(0).equals("null")){
            lst.remove(0);
            return null;
        }

        TreeNode head = new TreeNode(Integer.parseInt(lst.get(0)));
        lst.remove(0);
        head.left = rdeserialize(lst);
        head.right = rdeserialize(lst);

        return head;
    }
}
