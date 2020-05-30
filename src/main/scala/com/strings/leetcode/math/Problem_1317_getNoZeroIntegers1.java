package com.strings.leetcode.math;

import java.util.Arrays;
import java.util.Random;

public class Problem_1317_getNoZeroIntegers1 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getNoZeroIntegers(11)));
    }

    public static int[] getNoZeroIntegers(int n) {
        Random random = new Random();
        int a = random.nextInt(n);
        int b = n - a;
        while (hasZero(a) || hasZero(b)) {
            a = random.nextInt(n);
            b = n - a;
        }
        int[] res = new int[2];
        res[0] = a;
        res[1] = b;
        return res;
    }

    static boolean   hasZero(int n) {
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                return true;
            }
        }
        return false;
    }


}
