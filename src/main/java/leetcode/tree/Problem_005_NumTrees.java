package leetcode.tree;

/**
 *
 * G(n) = sum_{i= 1}^{n}{G(i−1)⋅G(n−i)}
 */

public class Problem_005_NumTrees {

    public static int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n ; i++) {
            for (int j = 1; j <= i ; j++) {
                dp[i] += dp[j-1]*dp[i-j];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(numTrees(n));
    }
}
