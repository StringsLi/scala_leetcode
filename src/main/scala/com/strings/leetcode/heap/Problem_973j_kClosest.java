package com.strings.leetcode.heap;

import scala.actors.threadpool.Arrays;

import java.util.PriorityQueue;

public class Problem_973j_kClosest {
    public static int[][] kClosest(int[][] points, int K) {
        if(K == 0 || points.length == 0){
            return new int[0][0];
        }
        PriorityQueue<int[]> heap = new PriorityQueue<>((o1, o2) ->
                o2[0]*o2[0] + o2[1]*o2[1] - o1[0]*o1[0] - o1[1]*o1[1]
        );

        for(int[] p:points){
            heap.offer(p);
            if(heap.size() > K){
                heap.poll();
            }
        }
        int[][] res = new int[K][2];
        int count = 0;
        for(int[] i:heap){
            res[count++] = i;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] points = {{1,3},{-2,2}};
        int K = 1;
        System.out.println(Arrays.deepToString(kClosest(points,1)));
    }
}
