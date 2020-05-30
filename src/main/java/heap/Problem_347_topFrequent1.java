package heap;

import java.util.*;

public class Problem_347_topFrequent1 {

    public static List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> count = new HashMap<>();
        for(int n:nums){
            count.put(n,count.getOrDefault(n,0) + 1);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(count::get));

        for(Integer i: count.keySet()){
            queue.add(i);
            while (queue.size() > k){
                queue.poll();
            }
        }

        List<Integer> res = new ArrayList<>();
        while (!queue.isEmpty()){
            res.add(queue.poll());
        }
        Collections.reverse(res);
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        List<Integer> res = topKFrequent(nums,2);
        System.out.println(res);
    }

}
