package leetcode.backtracking;

public class Problem_343_integerBreak {

    public static void main(String[] args) {
        Problem_343_integerBreak sl = new Problem_343_integerBreak();
//        System.out.println(sl.integerBreak(5));
//        System.out.println(sl.integerBreak3(5));
    }

    public static int integerBreak1(int n) {
        if (n == 2) {
            return 1;
        }
        int res = -1;
        for (int i = 1; i <= n - 1; i++) {
            res = Math.max(res, Math.max(i * (n - i), i * integerBreak1(n - i)));
        }
        return res;


    }

    /**
     * 我们考虑最后一步的情况，即最后剪的一下，会把绳子分为两部分，且两部分的结果互不影响
     *
     * 定义 dp[i] 表示长度i的绳子能得到的最大乘积
     *
     * 则 dp[i] 等于 在绳子区间[0, i)之间剪开的两部分乘积最大值
     *
     * 如果剪开位置为k，则区间分为[0, k)和[k, i)两部分
     *
     * 第一部分长度为k, 第二部分长度为i-k
     *
     * 第二部分存在剪和不剪两种情况，剪的时候值为dp[i-k]，不剪的时候取（i-k)
     *
     * 于是得到状态转换方程：
     *
     * dp[i] = max{ k * dp[i-k], k * (i-k)} (2<=k<=i)
     *
     * 作者：muyids
     * 链接：https://leetcode-cn.com/problems/jian-sheng-zi-lcof/solution/xu-lie-xing-dong-tai-gui-hua-by-muyids-2/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     * @param n
     * @return
     */

    public static int integerBreak3(int n) {
        int[] dp = new int[n + 1];
        dp[2] = 1;
        for (int i = 3; i <= n; i++){
            for (int j = 1; j <= i - 1; j++) {
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
            }
        }
        return dp[n];
    }

    // 记忆化搜索-自顶向下
    int[] memory;
    public int integerBreak(int n) {
        memory = new int[n + 1];
        return integerBreakHelper(n);
    }
    public int integerBreakHelper(int n) {
        if (n == 2) {
            return 1;
        }
        // 记忆化的核心
        if (memory[n] != 0) {
            // memory的初始值为0，如果它不为0，说明已经计算过了，直接返回即可
            return memory[n];
        }
        int res = -1;
        for (int i = 1; i <= n - 1; i++) {
            res = Math.max(res, Math.max(i * integerBreakHelper(n - i), i * (n - i)));
        }
        memory[n] = res;
        return res;
    }


}
