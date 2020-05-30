package math;

/**
 * 快速幂
 *
 * x^n = if n 为偶数 x^{n/2} * x^{n/2}  elif n 为奇数 x^{n/2} * x^{n/2} * x
 *
 *
 */

public class PowerXN {

    public static void main(String[] args) {
        double x = 2;
        int n = 3;
        System.out.println(myPow(x,n));
    }


    public static double fastPow(double x, long n){
        if(n==0){
            return 1;
        }
        double A = fastPow(x, n/2);
        if(n%2==0){
            return A * A;
        }else {
            return A * A *x;
        }
    }


    public static double myPow(double x, int n) {
        long N = n;
        if(N < 0){
            x = 1/x;
            N = -N;
        }

        return fastPow(x,N);
    }
}
