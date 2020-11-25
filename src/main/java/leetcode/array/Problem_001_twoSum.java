package leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class Problem_001_twoSum {

    public static void main(String[] args) throws Exception {
        int[] nums = {3,2,4};
        int[] result = twoSumII(nums, 6);
        for (int i : result) System.out.println(i);
    }

    /**
     *  这种方法适用于nums是有序的数组，要不然的话，就会出错。{3,2,4};
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while(i <j){
            int x = (nums[i] + nums[j]);
            if( x == target){
                int[] res = new int[2];
                res[0] = i;
                res[1] = j;
                return res;
            }else if( x < target){
                i++;
            }else{
                j--;
            }
        }
        return new int[2];
    }

    public static int[] twoSumII(int[] nums, int target) {
        Map<Integer,Integer> hashmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(hashmap.containsKey(target - nums[i])){
                return new int[]{hashmap.get(target - nums[i]),i};
            }
            hashmap.put(nums[i],i);
        }
        return new int[2];
    }
}
