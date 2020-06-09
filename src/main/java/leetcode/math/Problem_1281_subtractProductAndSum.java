package leetcode.math;

public class Problem_1281_subtractProductAndSum {

    public static void main(String[] args) {
        int n =234;
        System.out.println(subtractProductAndSum(n));

    }

    public static int subtractProductAndSum(int n){
        int add = 0, mul = 1;
        while (n > 0){
            int digit = n % 10;
            n /= 10;
            add += digit;
            mul *= digit;
        }
        return mul - add;
    }


}
