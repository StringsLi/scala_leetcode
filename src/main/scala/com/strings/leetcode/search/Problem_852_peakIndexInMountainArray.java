package com.strings.leetcode.search;

public class Problem_852_peakIndexInMountainArray {

    public static void main(String[] args) {
        int[] A = {0,2,1,0};
        System.out.println(peakIndexInMountainArray(A));
    }


    public static int peakIndexInMountainArray(int[] A){
        int lo = 0;
        int hi = A.length -1;
        while (lo <= hi){
//            int mid = (lo + hi) >>> 2; 使用这种形式的超时了
            int mid = lo + (hi - lo) /2;
            if(A[mid] < A[mid+1]){
                lo = mid + 1;
            }else {
                hi = mid - 1;
            }
        }
        return lo;
    }
}
