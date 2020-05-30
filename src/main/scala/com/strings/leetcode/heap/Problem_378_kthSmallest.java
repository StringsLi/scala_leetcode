package com.strings.leetcode.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Problem_378_kthSmallest {
    public static int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        for(int[] arr:matrix){
            for(int i: arr){
                heap.offer(i);
                if(heap.size() > k){
                    heap.poll();
                }
            }
        }
        return heap.peek();
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,  5,  9},{10, 11, 13},{12, 13, 15}};
        System.out.println(kthSmallest(matrix,8));
    }

}
