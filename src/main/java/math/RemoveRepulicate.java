package math;

public class RemoveRepulicate {

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,1,2,3};
        System.out.println(removeDuplicates(nums));
        System.out.println(nums.length);
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }


}
