package math;


public class IsPowerOfThree {

    public static void main(String[] args) {
        int[] nums = {0,1,8,27,81,109,-27};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + "=>>"+isPowerOfThree(nums[i]));
        }

    }


    public static boolean isPowerOfThree(int n) {
        if(n < 1) return false;
        while (n % 3 == 0){
            n = n / 3;
        }
        return n == 1;
    }
}
