package dp;

public class Robber {

    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};
        System.out.println(Robber.rob(nums));

        int[] nums2 = {2,1,4,5,3,1,1,3};
        System.out.println(massage(nums2));
    }

    public static int rob(int[] nums){
        if(nums.length == 0)
            return 0;
        int[] dp = new int[nums.length+1];
        dp[0] = 0;
        dp[1] = nums[0];

        for (int i = 2; i < nums.length +1; i++) {
            dp[i] = Math.max(dp[i-2] + nums[i-1],dp[i-1]);   //
        }
        return dp[nums.length];
    }

    public static int massage(int[] nums) {
        if(nums.length == 0)
            return 0;
        int[] dp = new int[nums.length+1];
        dp[0] = 0;
        dp[1] = nums[0];

        for (int i = 2; i < nums.length +1; i++) {
            dp[i] = Math.max(dp[i-2] + nums[i-1],dp[i-1]);   //
        }
        return dp[nums.length];
    }
}
