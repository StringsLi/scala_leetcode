package array;

import java.util.Arrays;

/**
 * 数组转置
 */

public class Problem_867_transpose {

    public static void main(String[] args) {
        int[][] A = {{1,2,3},{4,5,6}};
        System.out.println(transpose(A));
    }


    public static int[][] transpose(int[][] A) {
        int m = A.length, n = A[0].length;
        int[][] transA = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m ; j++) {
                transA[i][j] = A[j][i];
            }
        }
        for(int[] arr:transA){
            System.out.println(Arrays.toString(arr));
        }
        return transA;
    }


    public static int[][] reshape(int[][] A) {
        int m = A.length, n = A[0].length;
        int[][] transA = new int[n][m];
        int count = 0;
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n; j++) {
                transA[count / m][count % m] = A[i][j];
                count++;
            }
        }
        return transA;

    }
}
