package math;

import java.util.Arrays;

public class ThreeSumClosest {

    public static void main(String[] args) {
        int[] nums = new int[]{-1,2,1,-4};

        System.out.println(threeSumClosest(nums,1));
    }

    public static int threeSumClosest(int[] nums,int target){
        Arrays.sort(nums);
        int left;
        int right;
        int res = nums[0] + nums[1] + nums[2];
        int len = nums.length;
        for (int i = 0; i < len - 1 ; i++) {
            left = i + 1;
            right = len -1;
            while (left < right){

            int sum = nums[i] + nums[left] + nums[right];
            if(Math.abs(target - sum) < Math.abs(target - res))
                res = sum;

            if(sum < target){
                left++;
            }else if(sum > target){
                right--;
                }else {
                return res;
                }
            }
        }

        return res;
    }
}
