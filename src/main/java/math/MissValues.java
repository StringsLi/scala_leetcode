package math;

public class MissValues {

    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }


    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sumN = n * (n + 1) /2;
        int sumNums = 0;
        for(int i:nums){
            sumNums += i;
        }
        return sumN - sumNums;
    }
}
