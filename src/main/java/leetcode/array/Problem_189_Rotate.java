package leetcode.array;

import java.util.Arrays;

public class Problem_189_Rotate {
    public static void main(String[] args) {
        int[] nums = {-1};
        int k = 1;
        rotate(nums,k);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums,int k){
        k %= nums.length;
        int n = nums.length;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);

    }

    public static void reverse(int[] nums,int start, int end){
        while (start < end){
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start ++;
            end --;
        }
    }
}
