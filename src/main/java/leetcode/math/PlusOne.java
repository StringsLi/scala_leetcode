package leetcode.math;

public class PlusOne {

    public static int[] plusOne(int[] digits){

        for (int i = digits.length -1; i >= 0 ; i--) {
            digits[i] ++;
            digits[i] = digits[i] % 10;
            if(digits[i] != 0){
                return digits;
            }
        }
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }

    public static void main(String[] args) {
        int[] digits = {1,2,4,9};

        int[] res = plusOne(digits);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

    }
}
