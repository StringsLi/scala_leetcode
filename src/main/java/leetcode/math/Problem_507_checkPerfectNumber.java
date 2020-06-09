package leetcode.math;

public class Problem_507_checkPerfectNumber {

    public static void main(String[] args) {
        int n = 28;
        System.out.println(checkPerfectNumber(n));
    }

    public static boolean checkPerfectNumber(int n){

        if(n < 4) return false;
        int sum = 0;
        for (int i = 1; i <= n / 2 ; i++) {
            if(n % i == 0){
                sum += i;
            }
        }
        return sum == n;
    }
}
