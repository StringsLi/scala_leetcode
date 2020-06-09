package leetcode.math;

public class Ugly {

    public static void main(String[] args) {
        int num = 10;
        System.out.println(isUgly2(8));
    }

    /**
     *  递归方法
     * @param num
     * @return
     */

    public static boolean isUgly(int num){
        if(num == 0) return false;
        if(num == 1) return true;
        if(num % 2 == 0) return isUgly(num /2);
        if(num % 3 == 0) return isUgly(num / 3);
        if(num % 5 == 0) return isUgly(num /5);
        return false;
    }

    /**
     * 迭代方法
     * @param num
     * @return
     */
    public static boolean isUgly2(int num){
        int[] arr = {2,3,5};
        for(int i:arr){
            while (num % i == 0 && i <= num){
                num /= i;
            }
        }
        return num == 1;
    }
}
