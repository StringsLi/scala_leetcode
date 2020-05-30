package array;

import java.util.*;

public class Problem_1331_arrayRankTransform {

    public static void main(String[] args) {
        int[] arr  = {37,12,28,9,100,56,80,5,12};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }

    public static int[] arrayRankTransform(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] arr_copy = arr.clone();
        Arrays.sort(arr);
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if(!map.containsKey(arr[i])) {
                map.put(arr[i],count);
                count++;
            }
        }
        System.out.println(map);
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = map.get(arr_copy[i]);
        }

        return res;
    }
}
