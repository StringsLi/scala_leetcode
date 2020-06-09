package leetcode.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Problem_216_findKthLargest {

    public static void main(String[] args) {
        int[] nums =  {3,2,3,1,2,4,5,5,6};
        int k = 4;
        System.out.println(findKthLargest(nums,k));
        System.out.println(findKthLargest1(nums,k));
    }

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(n -> n));

        for(int n:nums){
            queue.add(n);
            if(queue.size() > k){
                queue.poll();
            }
        }
        return queue.poll();
    }

    public static int findKthLargest1(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
