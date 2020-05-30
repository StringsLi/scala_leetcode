package array;

public class Problem_152_MaxProduct {

    public static void main(String[] args) {
        int[] nums = {1,2,3,-4,-4,3};
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums){
        int max = Integer.MIN_VALUE;
        int imax = 1, imin = 1;
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i] < 0){
                int tmp = imin;
                imin = imax;
                imax = tmp;
            }
            imax = Math.max(imax * nums[i],nums[i]);
            imin = Math.min(imin * nums[i],nums[i]);
            max = Math.max(max,imax);
        }

        return max;

    }
}
