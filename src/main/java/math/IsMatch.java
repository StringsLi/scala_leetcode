package math;

/*

状态定义
dp[i][j]：表示 s 的前i个字符是否与 p的前j个字符是否匹配
状态方程
当 s[i] == p[j] 或者p[j] == '?' 时
dp[i][j] = dp[i-1][j-1]
当 s[i] != p[j] && p[j] == '*' 时
dp[i][j] = dp[i-1][j] || dp[i][j-1]
dp[i-1][j]：匹配任意非空字符，例如abkk,ab*
dp[i][j-1]：匹配空字符相当于0个，例如ab，ab*
初始化
dp[0][0]：两个空字符串，为true
dp[0][j]：当s为空，p为*号时，为true
p[j-1] == '*' && dp[0][j] = dp[0][j-1]

 */


public class IsMatch {

    public static void main(String[] args) {
        String s = "aa";
        String p = "*";
        System.out.println(isMatch(s,p));
    }

    public static boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        boolean[][] dp = new boolean[n+1][m+1];
        dp[0][0] = true;
        for (int j = 1; j <= m; j++) {
            if(p.charAt(j-1) == '*'){
                dp[0][j] = dp[0][j-1];
            }
        }

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= m ; j++) {
                if(s.charAt(i-1) == p.charAt(j-1)|| p.charAt(j-1) == '?'){
                    dp[i][j] = dp[i-1][j-1];
                }
                if(s.charAt(i-1) != p.charAt(j-1) && p.charAt(j-1) == '*'){
                    dp[i][j] = (dp[i-1][j] || dp[i][j-1]);
                }
            }
        }

        return dp[n][m];
    }
}
