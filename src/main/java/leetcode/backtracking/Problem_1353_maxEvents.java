package leetcode.backtracking;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Problem_1353_maxEvents {
    public static void main(String[] args) {
        int[][] events = {{1,4},{4,4},{2,2},{3,4},{1,1}};
        System.out.println(maxEvents(events));
    }

    public static int maxEvents(int[][] events) {
        Arrays.sort(events, Comparator.comparingInt(o -> o[1]));
        Set<Integer> set = new HashSet<>();
        for(int[] event:events){
            int s = event[0];
            int e = event[1];
            for (int i = s; i <= e; i++) {
                if(!set.contains(i)){
                    set.add(i);
                    break;
                }
            }
        }
        return set.size();
    }
}
