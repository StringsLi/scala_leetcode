package array;

import java.util.Arrays;

public class Problem_977_sortedSquares {

    public int[] sortedSquares(int[] A) {
        int[] A2 = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            A2[i] = (int) Math.pow(A[i],2);
        }
        Arrays.sort(A2);
        return A2;
    }
}
