package leetcode.dp;

public class RobotMove2 {

    public static void main(String[] args) {

//        int m = 3;
//        int n = 7;
        int[][] arr = new int[][] {{1,2,3},{2,3,1},{2,4,1}};
        System.out.println(RobotMove2.unqiuePaths(arr));

    }

    private static int unqiuePaths(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;

        if(m <=0 || n <= 0){
            return 0;
        }

        int[][] dp = new int[m][n];   // m * n 的矩阵
        dp[0][0] = arr[0][0];
        for (int i = 1; i < m ; i++) {
            dp[i][0] = dp[i-1][0] + arr[i][0];
        }
        for (int j = 1; j < n ; j++) {
            dp[0][j] = dp[0][j-1] + arr[0][j];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n ; j++) {
                dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1]) + arr[i][j];
            }
        }

        return dp[m-1][n-1];
    }
}
