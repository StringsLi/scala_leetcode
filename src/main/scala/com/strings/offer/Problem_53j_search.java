package com.strings.offer;

public class Problem_53j_search {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        System.out.println(search(nums,6));
    }

    public static int search(int[] nums, int target) {
        if(nums.length == 0 ) return 0;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                int i = mid, j = mid;
                while (i >= 0 && nums[i] == target) i--;
                while (j <= nums.length - 1 && nums[j] == target) j++;
                return j - i - 1;
            }else if(nums[mid] < target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return 0;

    }
}
