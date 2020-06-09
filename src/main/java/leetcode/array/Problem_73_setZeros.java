package leetcode.array;

public class Problem_73_setZeros {

    public void setZeroes(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length ; j++) {
                if(matrix[i][j] == 0){
                    for (int k = 0; k < matrix[0].length; k++) {
                        if(matrix[i][k] != 0) {
                            matrix[i][k] = Integer.MAX_VALUE;
                        }
                    }
                    for (int k = 0; k < matrix.length; k++) {
                        if(matrix[k][j] != 0) {
                            matrix[k][j] = Integer.MAX_VALUE;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length ; j++) {
                if(matrix[i][j] == Integer.MAX_VALUE){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
