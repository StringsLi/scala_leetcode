package leetcode.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};

        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        int left;
        int right;
        int sum;
        int len = nums.length;
        List<List<Integer>> list = new  ArrayList<>();
        for (int i = 0; i < len -2 ; i++) {

            if(nums[i] > 0){
                break;
            }

            if (i > 0 && nums[i] == nums[i - 1]) continue; //跳过可能重复的结果
            left = i + 1;
            right = len -1;

            while (left < right){
                sum = nums[i] + nums[left] + nums[right];
                if(sum < 0){
                    left++;
                }else if(sum > 0){
                    right--;
                }else if(sum == 0){
                    list.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while (left < right && nums[left + 1] == nums[left]) left++;
                    while (left < right && nums[right - 1] == nums[right]) right--;
                    left++;
                    right--;
                }
            }


        }
    return list;
    }
}
