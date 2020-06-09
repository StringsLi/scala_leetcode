package leetcode.tree;

public class Problem_003_SortedArrayToBST {

    public static class TreeNode {
        public int value;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int data) {
            this.value = data;
        }
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0){
            return null;
        }
        return helper(nums,0,nums.length-1);
    }

    public static TreeNode helper(int[] nums,int start, int end){
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) /2;
        TreeNode head = new TreeNode(nums[mid]);
        head.left = helper(nums,start,mid -1);
        head.right = helper(nums,mid + 1,end);
        return  head;
    }



    public static void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};

        System.out.println(sortedArrayToBST(nums));
    }
}
