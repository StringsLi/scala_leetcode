package leetcode.bitwise;

import java.util.HashMap;
import java.util.Map;

public class Problem_137_singleNumberII {

    public static int singleNumber(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            Integer num = map.get(i);
            map.put(i,num == null ? 1:num+1);
        }

        for(Integer key:map.keySet()){
            if(map.get(key) == 1){
                return key;
            }
        }

        return -1;
    }
}
