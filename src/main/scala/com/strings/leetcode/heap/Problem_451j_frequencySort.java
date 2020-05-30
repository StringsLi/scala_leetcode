package com.strings.leetcode.heap;

import java.util.*;

public class Problem_451j_frequencySort {

    public static String frequencySort(String s){
        if(s == null || s.length() < 2){
            return s;
        }
        char[] barcodes = s.toCharArray();
        Map<Character,Integer> countMap = new HashMap<>();
        for(char b:barcodes){
            countMap.put(b,countMap.getOrDefault(b,0)+1);
        }

        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> countMap.get(b) - countMap.get(a));

        for(char i:countMap.keySet()){
            maxHeap.add(i);
        }

        StringBuilder sb = new StringBuilder();
        while (!maxHeap.isEmpty()){  // 注意不能使用for(char c:maxHeap)
            char a = maxHeap.poll();
            int freq = countMap.get(a);
            for (int i = 0; i < freq; i++) {
                sb.append(a);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s  = "Aabb";
        System.out.println(frequencySort(s));
    }
}
