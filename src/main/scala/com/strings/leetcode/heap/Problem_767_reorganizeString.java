package com.strings.leetcode.heap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Problem_767_reorganizeString {

    public static String reorganizeString(String S) {
        if(S == null || S.length() < 2){
            return S;
        }
        char[] barcodes = S.toCharArray();
            Map<Character,Integer> countMap = new HashMap<>();
            for(char b:barcodes){
                countMap.put(b,countMap.getOrDefault(b,0)+1);
            }
            if(Collections.max(countMap.values()) > (S.length()+1)/2){
                return "";
            }
            PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> countMap.get(b) - countMap.get(a));

            for(char i:countMap.keySet()){
                maxHeap.add(i);
            }
            char[] res = new char[barcodes.length];
            int idx = 0;
            while(maxHeap.size() > 1){
                char a = maxHeap.poll();
                char b = maxHeap.poll();
                res[idx++] = a;
                res[idx++] = b;
                int freqA = countMap.get(a);
                int freqB = countMap.get(b);
                if(freqA > 1){
                    countMap.put(a,freqA-1);
                    maxHeap.offer(a);
                }
                if(freqB > 1){
                    countMap.put(b,freqB-1);
                    maxHeap.add(b);
                }
            }
            if(maxHeap.size() > 0){
                res[idx] = maxHeap.poll();
            }
            return String.valueOf(res);
    }

    public static void main(String[] args) {
        String S1 = "aab";
        String S2 = "aaab";

        System.out.println(reorganizeString(S1));
        System.out.println(reorganizeString(S2));
    }
}
