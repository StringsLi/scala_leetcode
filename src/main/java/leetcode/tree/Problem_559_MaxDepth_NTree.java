package leetcode.tree;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem_559_MaxDepth_NTree {

    static  class Node {
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

    public int maxDepth(Node root) {
      if(root == null) return 0;
      else if(root.children.isEmpty()){
          return 1;
      }else{
          List<Integer> heights = new ArrayList<>();
          for (Node item : root.children) {
              heights.add(maxDepth(item));
          }
          return Collections.max(heights) + 1;
      }
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

        Problem_559_MaxDepth_NTree so = new Problem_559_MaxDepth_NTree();

        System.out.println(so.maxDepth(root));


    }



}
