package math;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDisappearedNumbers {

    public static void main(String[] args) {
        int[] nums = {1,3,4};
        System.out.println(findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums){
        Map<Integer,Boolean> map = new HashMap<>();

        for (int i = 0; i < nums.length ; i++) {
            map.put(nums[i],true);
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <= nums.length ; i++) {
            if(!map.containsKey(i)){
                res.add(i);
            }
        }

        return res;
    }
}
