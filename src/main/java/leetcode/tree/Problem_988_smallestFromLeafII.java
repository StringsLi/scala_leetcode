package leetcode.tree;

public class Problem_988_smallestFromLeafII {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int data) {
            this.val = data;
        }
    }

    String ans = "~";
    public String smallestFromLeaf(TreeNode root) {
        dfs(root, new StringBuilder());
        return ans;
    }

    public void dfs(TreeNode node, StringBuilder sb) {
        if (node == null) return;
        sb.append((char)('a' + node.val));

        if (node.left == null && node.right == null) {
            sb.reverse();
            String S = sb.toString();
            sb.reverse();

            if (S.compareTo(ans) < 0)
                ans = S;
        }

        dfs(node.left, sb);
        dfs(node.right, sb);
        sb.deleteCharAt(sb.length() - 1);
    }


    public static void main(String[] args) {
        TreeNode head = new TreeNode('a');
        head.left = new TreeNode('b');
        head.right = new TreeNode('c');
//        head.left.left = new TreeNode(11);
//        head.left.left.left = new TreeNode(7);
//        head.left.left.right = new TreeNode(2);
//
//        head.right.left = new TreeNode(13);
//        head.right.right = new TreeNode(4);
//        head.right.right.left = new TreeNode(5);
//        head.right.right.right = new TreeNode(1);

        Problem_988_smallestFromLeafII pp = new Problem_988_smallestFromLeafII();

        System.out.println(pp.smallestFromLeaf(head));

    }



}
