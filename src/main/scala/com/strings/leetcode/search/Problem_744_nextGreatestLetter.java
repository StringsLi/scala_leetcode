package com.strings.leetcode.search;

public class Problem_744_nextGreatestLetter {

    public static void main(String[] args) {
        char[] leeters = {'c', 'f', 'j'};
        System.out.println(nextGreatestLetter(leeters,'z'));
    }

    public static char nextGreatestLetter(char[] letters, char target){
        int left = 0;
        int right = letters.length;
        while (left < right){
            int mid = left + (right - left)/2;
            if(letters[mid] <= target) left = mid + 1;
            else right = mid;
        }

        return letters[left % letters.length];
    }

    public char nextGreatestLetter2(char[] letters, char target) {
        for (char c: letters)
            if (c > target) return c;
        return letters[0];
    }
}
