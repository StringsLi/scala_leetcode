package leetcode.intervel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Problem_56_merge {

    public static int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        if (intervals == null || intervals.length == 0)
            return res.toArray(new int[0][]);

        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        int i = 0;
        while (i < intervals.length) {
            int left = intervals[i][0];
            int right = intervals[i][1];
            // i不能到最后一行,所以要小于(数组的长度 - 1)
            // 判断所在行的right和下一行的left大小,对right重新进行赋最大值,之后再不断进行while循环判断
            while (i < intervals.length - 1 && right >= intervals[i + 1][0]) {
                i++;
                right = Math.max(right, intervals[i][1]);
            }
            res.add(new int[] { left, right });
            i++;
        }
        return res.toArray(new int[0][]);

    }

    public static void main(String[] args) {
        int[][] intervals = {{2,6},{8,10},{15,18},{1,3}};
        int[][] res = merge(intervals);

        for (int[] nums:res){
            System.out.println(Arrays.toString(nums));
        }
    }
}
