package dp;

public class RobotMove {

    public static void main(String[] args) {

        int m = 3;
        int n = 7;
        System.out.println(RobotMove.unqiuePaths(m,n));

    }

    private static int unqiuePaths(int m,int n){
        if(m <=0 || n <= 0){
            return 0;
        }

        int[][] dp = new int[m][n];   // m * n 的矩阵
        for (int i = 0; i < m ; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < n ; j++) {
            dp[0][j] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n ; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        return dp[m-1][n-1];
    }
}
