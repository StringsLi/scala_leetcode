package tree;

import java.util.*;

public class Problem_429_levelOrderNtrees {
// Definition for a Node.
    static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            int cnt = queue.size();
            List<Integer> levels = new ArrayList<>();
            for (int i = 0; i < cnt; i++) {
                Node node = queue.poll();
                levels.add(node.val);
                queue.addAll(node.children);
            }
            res.add(levels);
        }

        return res;
    }

    public static void main(String[] args) {
        Node root = new Node(1);

        List<Node> child = new ArrayList<>();
        Node child1 = new Node(3);
        Node child2 = new Node(2);
        Node child3 = new Node(4);

        child.add(child1);
        child.add(child2);
        child.add(child3);

        List<Node> child_son = new ArrayList<>();
        child_son.add(new Node(5));
        child_son.add(new Node(6));

        child1.children = child_son;
        root.children = child;

        System.out.println(levelOrder(root));
    }


}
