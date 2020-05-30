package tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * 超出时间限制
 */

public class Problem_988_smallestFromLeaf {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int data) {
            this.val = data;
        }
    }

    List<List<Character>> list = new ArrayList<>();
    List<Character> inner = new ArrayList<>();

    public String smallestFromLeaf(TreeNode root) {

        if(root == null) return "";
        inner.add((char)root.val);

        if(root.left == null && root.right == null){
            list.add(new ArrayList<>(inner));
        }
        if(root.left != null) smallestFromLeaf(root.left);
        if(root.right != null) smallestFromLeaf(root.right);
        inner.remove(inner.size() -1);
        String[] res = new String[list.size()];
        for (int i = 0; i < list.size() ; i++) {
            res[i] = list2String(list.get(i));
        }
        Arrays.sort(res);
        return res[0];
    }

    public static String list2String(List<Character> list){
        StringBuilder sb = new StringBuilder();
        for (int i = list.size() - 1; i >= 0 ; i--) {
            sb.append(list.get(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode('a');
        head.left = new TreeNode('b');
        head.right = new TreeNode('c');


        Problem_988_smallestFromLeaf pp = new Problem_988_smallestFromLeaf();

        System.out.println(pp.smallestFromLeaf(head));

        String[] ss = {"abdc","abd"};
        Arrays.sort(ss);

        System.out.println(Arrays.toString(ss));
    }



}
