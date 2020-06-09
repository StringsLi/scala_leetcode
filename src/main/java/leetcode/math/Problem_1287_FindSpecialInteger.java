package leetcode.math;

public class Problem_1287_FindSpecialInteger {

    public static void main(String[] args) {
        int[] nums = {1,1,1,1,2,3,4};
        System.out.println(findSpecialInteger(nums));
    }

    public static int findSpecialInteger(int[] nums){
        int n = nums.length;
        int cur = nums[0],cnt = 0;
        for (int i = 0; i < n ; i++) {
            if(nums[i] == cur){
                cnt ++;
                if(cnt*4 > n){
                    return cur;
                }
            }else{
                cur = nums[i];
                cnt = 1;
            }
        }
        return -1;
    }
}
