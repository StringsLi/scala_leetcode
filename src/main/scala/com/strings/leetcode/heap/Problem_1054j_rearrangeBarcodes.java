package com.strings.leetcode.heap;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Problem_1054j_rearrangeBarcodes {
    public static int[] rearrangeBarcodes2(int[] barcodes) {
        if(barcodes == null || barcodes.length < 2){
            return barcodes;
        }
        Map<Integer,Integer> countMap = new HashMap<>();
        for(int b:barcodes){
            countMap.put(b,countMap.getOrDefault(b,0)+1);
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> countMap.get(b) - countMap.get(a));

        for(int i:countMap.keySet()){
            maxHeap.add(i);
        }
        int[] res = new int[barcodes.length];
        int idx = 0;
        while(maxHeap.size() > 1){
            int a = maxHeap.poll();
            int b = maxHeap.poll();
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

        return res;
    }

    public static int[] rearrangeBarcodes(int[] barcodes) {
        if(barcodes == null || barcodes.length < 2) return barcodes;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : barcodes) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        //大顶堆
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        for(int i : map.keySet()) {
            maxHeap.offer(i);
        }
        int[] res = new int[barcodes.length];
        int idx = 0;
        while(maxHeap.size() > 1) {
            int a = maxHeap.poll();
            int b = maxHeap.poll();
            res[idx++] = a;
            res[idx++] = b;
            int freqA = map.get(a);
            int freqB = map.get(b);
            if(freqA > 1) {
                map.put(a, freqA - 1);
                maxHeap.add(a);
            }
            if(freqB > 1) {
                map.put(b, freqB - 1);
                maxHeap.add(b);
            }
        }
        //收尾
        if(maxHeap.size() > 0) res[idx] = maxHeap.poll();
        return res;
    }

    public static void main(String[] args) {
        int[] bor = {1,1,2};
        System.out.println(Arrays.toString(rearrangeBarcodes(bor)));
        System.out.println(Arrays.toString(rearrangeBarcodes2(bor)));
    }
}


