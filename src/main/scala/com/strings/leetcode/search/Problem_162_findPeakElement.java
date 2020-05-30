package com.strings.leetcode.search;

public class Problem_162_findPeakElement {

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(findPeakElement(nums));
    }

    public int findPeakElement2(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1])
                return i;
        }
        return nums.length - 1;
    }


    public static int findPeakElement(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        while (left < right){
            int mid = left + (right - left) /2;
            if(nums[mid] > nums[mid+1]){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }

}
