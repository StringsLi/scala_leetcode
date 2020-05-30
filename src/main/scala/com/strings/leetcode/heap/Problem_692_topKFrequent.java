package com.strings.leetcode.heap;

import java.util.*;

public class Problem_692_topKFrequent {
    public static List<String> topKFrequent(String[] words, int k){
        Map<String,Integer> countMap = new HashMap<String, Integer>();
        for(String word:words){
            countMap.put(word,countMap.getOrDefault(word,0)+1);
        }

        PriorityQueue<String> queue = new PriorityQueue<String>(
                (o1, o2) -> countMap.get(o1) == countMap.get(o2)?
                        o2.compareTo(o1):countMap.get(o1) - countMap.get(o2)
        );

        for(String word:countMap.keySet()){
            queue.offer(word);
            if(queue.size() > k){
                queue.poll();
            }
        }

        List<String> ans = new ArrayList<>();
        while (!queue.isEmpty()){
            ans.add(queue.poll());
        }
        Collections.reverse(ans);
        return ans;

    }

    public static void main(String[] args) {
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        topKFrequent(words,2);
    }
}
