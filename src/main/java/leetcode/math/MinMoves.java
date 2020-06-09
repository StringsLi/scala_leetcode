package leetcode.math;

import java.util.Arrays;

public class MinMoves {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(minMoves(nums));
    }


    /**
     * n-1个数同时加一，就好比每次有一个数自身减一
     * ，因为只能做减法，所以数组最后的数只能是最小值。
     * 这样的话每个元素减去最小值求其和就是答案
     * @param nums
     * @return
     */

    public static int minMoves(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        int min = nums[0];
        for (int i = 1; i < nums.length ; i++) {
            sum += nums[i] - min;
        }

        return sum;
    }
}
