package array;

public class Problem_674_findLengthOfLCIS {


    public static void main(String[] args) {
//        int[] nums = {1,3,5,4,7};
        int[] nums = {2,2,2,2,2};
        System.out.println(findLengthOfLCIS(nums));
    }

    public static int findLengthOfLCIS(int[] nums){
        int[] diffs = diff(nums);
        int max = 0;
        int count = 0;
        for (int i = 0; i < diffs.length; i++) {
            if(diffs[i] > 0){
                count++;
                max = Math.max(count,max);
            }else{
                count = 0;
            }
        }

        return max + 1;

    }

    public static int[] diff(int[] nums){
        int[] res = new int[nums.length -1];
        for (int i = 0; i < nums.length -1; i++) {
            res[i] = nums[i+1] - nums[i];
        }
        return res;
    }
}
