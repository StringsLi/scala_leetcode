package leetcode.math;

/*

（一）状态
f[i][j]表示s1的前i个字符，和s2的前j个字符，能否匹配
（二）转移方程
如果s1的第 i 个字符和s2的第 j 个字符相同，或者s2的第 j 个字符为 “.”
f[i][j] = f[i - 1][j - 1]
如果s2的第 j 个字符为 *
若s2的第 j 个字符匹配 0 次第 j - 1 个字符
f[i][j] = f[i][j - 2] 比如(ab, abc*)
若s2的第 j 个字符匹配至少 1 次第 j - 1 个字符,
f[i][j] = f[i - 1][j] and s1[i] == s2[j - 1] or s[j - 1] == '.'
这里注意不是 f[i - 1][j - 1]， 举个例子就明白了 (abbb, ab*) f[4][3] = f[3][3]
（三）初始化

f[0][i] = f[0][i - 2] && s2[i] == *
即s1的前0个字符和s2的前i个字符能否匹配

 */


public class IsMatch2 {

    public static void main(String[] args) {
        String s = "mississippi";
        String p = "mis*is*ip*.";
        System.out.println(isMatch(s,p));
    }

    public static boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        boolean[][] dp = new boolean[n+1][m+1];
        dp[0][0] = true;
        for (int j = 2; j <= m; j++) {
                dp[0][j] = dp[0][j-2] &&  p.charAt(j-1) == '*';
        }
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= m ; j++) {
                if(s.charAt(i-1) == p.charAt(j-1)|| p.charAt(j-1) == '.'){
                    dp[i][j] = dp[i-1][j-1];
                }
                if(p.charAt(j-1) == '*'){
                    dp[i][j] = dp[i][j-2] ||
                            dp[i -1][j] &&(s.charAt(i-1) == p.charAt(j-2) || p.charAt(j-2) == '.');
                }
            }
        }

        return dp[n][m];
    }


        public static boolean isMatch2(String s, String p) {
            int m = s.length(), n = p.length();
            boolean[][] f = new boolean[m + 1][n + 1];

            f[0][0] = true;
            for(int i = 2; i <= n; i++){
                f[0][i] = f[0][i - 2] && p.charAt(i - 1) == '*';
            }

            for(int i = 1; i <= m; i++){
                for(int j = 1; j <= n; j++){
                    if(s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.'){
                        f[i][j] = f[i - 1][j - 1];
                    }
                    if(p.charAt(j - 1) == '*'){
                        f[i][j] = f[i][j - 2] ||
                                f[i - 1][j] && (s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.');
                    }
                }
            }

            return f[m][n];
        }


    public static boolean isMatch3(String s, String p) {
        int ls = s.length(), lp = p.length();
        boolean[][] dp = new boolean[ls + 1][lp + 1];
        dp[0][0] = true;
        for(int j = 2; j <= lp; j++)
            dp[0][j] = dp[0][j - 2] && p.charAt(j - 1) == '*';
        for(int i = 1; i <= ls; i++) {
            for(int j = 1; j <= lp; j++) {
                int m = i - 1, n = j - 1;
                if(p.charAt(n) == '*')
                    dp[i][j] = dp[i][j - 2] || dp[i - 1][j] &&
                            (s.charAt(m) == p.charAt(n - 1) || p.charAt(n - 1) == '.');
                else if(s.charAt(m) == p.charAt(n) || p.charAt(n) == '.')
                    dp[i][j] = dp[i - 1][j - 1];
            }
        }
        return dp[ls][lp];
    }


}
