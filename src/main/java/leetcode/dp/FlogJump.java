package leetcode.dp;

public class FlogJump {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(FlogJump.flogJump(n));
    }

    private static int flogJump(int n){
        if(n <= 1) {
            return n;
        }
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }


}
