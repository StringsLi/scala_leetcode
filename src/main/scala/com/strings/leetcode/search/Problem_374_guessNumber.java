package com.strings.leetcode.search;

public class Problem_374_guessNumber {

    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        while (left <= right){
            int mid = left + (right - left) / 2;
            int res = guess(mid);
            if(res == -1){
                right = mid - 1;
            }else if(res == 1){
                left = mid + 1;

            }else{
                return mid;
            }
        }
        return -1;

    }

    public static int guess(int num){
        return 1;
    }
}
