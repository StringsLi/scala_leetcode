package math;

import java.util.ArrayList;
import java.util.List;

public class Problem_264_nthUglyNum {
    public static void main(String[] args) {
        System.out.println(nthUglyNumber(100));
        System.out.println(nthUglyNumberII(100));
    }

    public static int nthUglyNumber(int n) {
        if(n == 1) return 1;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n * n * n *n * n; i++) {
            if(isUgly(i)) res.add(i);
            if(res.size() == n){
                break;
            }
        }
        return res.get(n-1);
    }

    public static int nthUglyNumberII(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        int u2 = 0,u3 = 0,u5 = 0;
        for (int i = 1; i < n ; i++) {
            dp[i] = Math.min(dp[u2] * 2,Math.min(dp[u3] * 3,dp[u5] * 5));
            if(dp[i] == dp[u2] * 2) u2++;
            if(dp[i] == dp[u3] * 3) u3++;
            if(dp[i] == dp[u5] * 5) u5++;
        }

        return dp[n-1];

    }

    public static boolean isUgly(int num){
        if(num == 0) return false;
        if(num == 1) return true;
        if(num % 2 == 0) return isUgly(num /2);
        if(num % 3 == 0) return isUgly(num / 3);
        if(num % 5 == 0) return isUgly(num /5);
        return false;
    }
}
