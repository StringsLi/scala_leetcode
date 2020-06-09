package leetcode.hash;

import java.util.HashMap;
import java.util.Map;

public class Problem_961_repeatedNTimes {

    public static void main(String[] args) {
        int[] A = {1,1,1,2,3,4};
        System.out.println(repeatedNTimes(A));
    }
    public static int repeatedNTimes(int[] A){
        Map<Integer, Integer> count = new HashMap();
        for (int x: A) {
            count.put(x, count.getOrDefault(x, 0) + 1);
        }

        for (int k: count.keySet()) {
            if (count.get(k) > 1)
                return k;
        }
        return 0;
    }

}
