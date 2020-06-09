package leetcode.math;

public class ArrangeCoins {

    public static void main(String[] args) {
        int[] nums = {1,3,6,10};
        for(int i:nums){
            System.out.println(arrangeCoins2(i));
        }
    }

    public static int arrangeCoins(int n){

        long left = 0,right = n,mid;
        while (left < right){
            mid = (left + right + 1) >>> 1;
            long t = (mid ) * (mid + 1) /2;
            if(t > n){
                right = mid -1;
            }else {
                left = mid;
            }
        }
        return (int)left;

    }

    public static int arrangeCoins2(int n){
        return (int)(Math.sqrt(2) * Math.sqrt(n + 0.125) - 0.5);
    }
}

