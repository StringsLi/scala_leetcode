package com.strings.leetcode.sort;

import java.util.Arrays;

public class Problem_976_largestPerimeter {

    public static void main(String[] args) {
        int[] A = {3,6,2,3};
        System.out.println(largestPerimeter(A));
    }

    public static int largestPerimeter(int[] A){
        Arrays.sort(A);
        for (int i = A.length-1; i >=2 ; i--) {
            int A1 = A[i], A2 = A[i-1], A3 = A[i-2];
            if((A2 + A3) > A1){
                return A1 + A2 + A3;
            }
        }
        return 0;
    }
}
