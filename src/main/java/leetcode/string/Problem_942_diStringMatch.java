package leetcode.string;

import java.util.Arrays;

public class Problem_942_diStringMatch {

    public static void main(String[] args) {
        String S = "IDID";
        System.out.println(Arrays.toString(diStringMatch(S)));
    }

    public static int[] diStringMatch(String S) {
        char[] chars = S.toCharArray();
        int N = chars.length;
        int[] res = new int[N + 1];
        int lo = 0, hi = N;
        for (int i = 0; i < N; i++) {
            if(chars[i] == 'I') res[i] = lo++;
            else  res[i] = hi--;
        }
        res[N] = lo;
        return res;
    }
}
