package leetcode.math;

/**
 *
 * n / 5 + n / 25 + n / 125 ...
 */

public class TrailingZeroes {

    public static  int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) {
            count += n / 5;
            n = n / 5;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(trailingZeroes(25));
    }
}
