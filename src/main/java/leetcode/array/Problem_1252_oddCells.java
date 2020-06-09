package leetcode.array;

public class Problem_1252_oddCells {

    public static void main(String[] args) {
        int n = 2, m =3;
        int[][] indices = {{0,1},{1,1}};
        System.out.println(oddCells(n,m,indices));
        System.out.println(oddCells2(n,m,indices));
    }

    /**
     * 方法一，直接计算统计
     * @param n
     * @param m
     * @param indices
     * @return
     */
    public static int oddCells(int n, int m, int[][] indices){
        int[][] inits = new int[n][m];
//        for (int i = 0; i < indices.length ; i++) {
//            for (int j = 0; j < indices[0].length; j++) {
        for(int[] arr:indices) {
            for (int k = 0; k < n; k++) {
                inits[k][arr[1]] += 1;
            }
            for (int k = 0; k < m; k++) {
                inits[arr[0]][k] += 1;
            }
        }
        int count = 0;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println(inits[i][j]);
                if(inits[i][j] % 2 == 1) count++;
            }
        }
        return count;
    }


    public static int oddCells2(int n, int m, int[][] indices){
        int[] row = new int[n];
        int[] column = new int[m];

        for(int[] arr:indices) {
            row[arr[0]]++;
            column[arr[1]]++;
        }
        int count = 0;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {
                if((row[i] + column[j]) % 2 == 1) count++;
            }
        }
        return count;
    }
}
