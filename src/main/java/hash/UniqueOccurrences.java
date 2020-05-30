package hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurrences {

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        System.out.println(uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = calFre(arr);

        for(Integer i : map.values()){
            if(!set.add(i)) return false;
        }
        return true;
    }

    /**
     * 统计每个数字出现的频次
     * @param arr
     * @return
     */
    public static Map<Integer, Integer> calFre(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i:arr){
            Integer num = map.get(i);
            map.put(i,num == null ? 1:num+1);
        }

        return map;
    }
}
