package com.strings.leetcode.heap;

import java.util.*;

public class Problem_40_mian_getLeastNumbers {

    public static int[]  getLeastNumbers(int[] arr, int k) {
        if(k == 0) return new int[0];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> (b -a));
        for(int i: arr){
            if(priorityQueue.size() < k){
                priorityQueue.add(i);
            }else{
                if(priorityQueue.peek() > i){
                    priorityQueue.remove();
                    priorityQueue.add(i);
                }
            }
        }

        int[] res = new int[k];
        int count = 0;
        while (priorityQueue.size() > 0){
            res[count++] = priorityQueue.remove();
        }
        return res;
    }

    public static int[] getLeastNumbers2(int[] arr, int k) {
        if(k == 0 || arr.length == 0){
            return new int[0];
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>((o1, o2) -> o2 - o1);

        for(int i:arr){
            heap.offer(i);
            if(heap.size() > k){
                heap.poll();
            }
        }

        int[] res = new int[k];
        int count = 0;
        while (!heap.isEmpty()){
            res[count++] = heap.poll();
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,1};
        System.out.println(Arrays.toString(getLeastNumbers2(arr,2)));
        System.out.println(Arrays.toString(getLeastNumbers(arr,2)));
    }
}
