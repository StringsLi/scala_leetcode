package com.strings.leetcode.search;

public class Problem_704_binarySearch {

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        System.out.println(search(nums,9));
        System.out.println(search(nums,2));
    }

    public static int search(int[] nums, int target) {
        if(nums.length == 0){
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;
        while (left <=  right){
            int mid = left + (right - left) / 2;
            int res = nums[mid];
            if(target == res){
                return mid;
            }else if (target > res){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
