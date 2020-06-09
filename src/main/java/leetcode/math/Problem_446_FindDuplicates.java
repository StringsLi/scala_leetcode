package leetcode.math;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Problem_446_FindDuplicates{
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer, Integer> map = calFre(nums);
        List<Integer> lst = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue() == 2){
                lst.add(entry.getKey());
            }
        }
        return lst;
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
