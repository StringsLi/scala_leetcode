package com.strings.leetcode.heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Problem_373j_kSmallestPairs {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> pair = new ArrayList<>();
        for (int i = 0; i < nums1.length ; i++) {
            for (int j = 0; j < nums2.length; j++) {
                List<Integer> res = new ArrayList<>();
                res.add(nums1[i]);
                res.add(nums2[j]);
                pair.add(res);
            }
        }

        PriorityQueue<List<Integer>> heap = new PriorityQueue<>((o1, o2) ->
                o2.get(0) + o2.get(1) - o1.get(0) - o1.get(1)
                );

        for(List<Integer> lst:pair){
            heap.offer(lst);
            if(heap.size() > k){
                heap.poll();
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        if(k==0 || nums1.length==0 || nums2.length == 0){
            return ans;
        }
        for(List<Integer> lst:heap){
            ans.add(lst);
        }
        return ans;


    }
}
