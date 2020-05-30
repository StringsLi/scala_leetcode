package greedy;

import java.util.Arrays;

public class TargetOffer_45_minNumber {
    public static void main(String[] args) {
        int[] nums = {3,30,34,5,9};
        System.out.println(minNumber(nums));
    }

    public static String minNumber(int[] nums) {
        int len = nums.length;
        String[] strNums = new String[len];
        for (int i = 0; i < len ; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strNums, (o1, o2) -> (o1 + o2).compareTo(o2 + o1));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(strNums[i]);
        }
        return sb.toString();
    }
}
