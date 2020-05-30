package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem_1200_MinimumAbsDifference {

    public static void main(String[] args) {
        int[] nums = {4,2,1,3};
        System.out.println(minimumAbsDifference(nums));
    }

    public static List<List<Integer>> minimumAbsDifference(int[] nums){
        Arrays.sort(nums);
        int min = nums[1] - nums[0];
        for (int i = 2; i < nums.length ; i++) {
            min = Math.min(min,nums[i] - nums[i-1]);
        }
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 1; i < nums.length ; i++) {
            if(min == nums[i] - nums[i-1]){
                res.add(Arrays.asList(nums[i-1],nums[i]));
            }
        }
        return res;
    }
}
