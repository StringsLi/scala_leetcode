package leetcode.string;

import java.util.Arrays;

public class Problem_848_shiftingLetters {

   static int[] cosum(int[] shifts){
       int[] res = new int[shifts.length];
        for (int i = shifts.length-1; i >= 0 ; i--) {
            res[i] += shifts[i];
        }
        return res;
    }

    public static String shiftingLetters(String S, int[] shifts) {
        int[] shifts2 = cosum(shifts);
        System.out.println(Arrays.toString(shifts2));
        return "";
    }

    public static void main(String[] args) {
        int[] shifts= {1, 3, 9};
        System.out.println(shiftingLetters("",shifts));
    }
}
