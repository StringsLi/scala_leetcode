package math;


import java.util.Arrays;

public class Problem_485_FindMaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] nums = {1,0,1,0,0};
        System.out.println(findMaxConsecutiveOnes2(nums));
    }

    public  static  int findMaxConsecutiveOnes(int[] nums) {
        String res = Arrays.toString(nums)
                           .replace(",","")
                           .replace("[","")
                           .replace("]","")
                           .replace(" ","");
        System.out.println(res);
//        System.out.println("1111");
        String[] listStr = res.split("0");
        System.out.println(Arrays.toString(listStr));

        return 0;
    }

    public static int findMaxConsecutiveOnes2(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                // Increment the count of 1's by one.
                count += 1;
            } else {
                // Find the maximum till now.
                maxCount = Math.max(maxCount, count);
                // Reset count of 1.
                count = 0;
            }
        }
        return Math.max(maxCount, count);
    }

}
