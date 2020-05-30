package com.strings.leetcode.heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Problem_786_kthSmallestPrimeFraction {

    /**
     *  这种方法超出时间限制
     * @param A
     * @param K
     * @return
     */
    public static int[] kthSmallestPrimeFraction(int[] A, int K) {
        int N = A.length;
        List<int[]> frac = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                frac.add(new int[]{A[i], A[j]});
            }
        }
        PriorityQueue<int[]> heap = new PriorityQueue<>((o1, o2) ->
                o2[0] * o1[1] - o1[0]* o2[1]);

        for (int[] arr:frac){
            heap.offer(arr);
            if(heap.size() > K){
                heap.poll();
            }
        }

        return heap.poll();
    }


    public static int[] kthSmallestPrimeFraction2(int[] A, int K) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) ->
                A[a[0]] * A[b[1]] - A[a[1]] * A[b[0]]);

        for (int i = 1; i < A.length; ++i)
            pq.add(new int[]{0, i});

        while (--K > 0) {
            int[] frac = pq.poll();
            if (frac[0]++ < frac[1])
                pq.offer(frac);
        }

        int[] ans = pq.poll();
        return new int[]{A[ans[0]], A[ans[1]]};
    }



    public static void main(String[] args) {
        int[] A = {1, 2, 3, 5};
//        System.out.println(Arrays.toString(kthSmallestPrimeFraction(A,3)));
        System.out.println(Arrays.toString(kthSmallestPrimeFraction2(A,3)));
    }
}
