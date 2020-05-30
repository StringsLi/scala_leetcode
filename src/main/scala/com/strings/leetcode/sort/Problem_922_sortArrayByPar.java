package com.strings.leetcode.sort;

public class Problem_922_sortArrayByPar {



        public int[] sortArrayByParityII(int[] A) {
            int N = A.length;
            int[] ans = new int[N];

            int t = 0;
            for (int x: A) if (x % 2 == 0) {
                ans[t] = x;
                t += 2;
            }

            t = 1;
            for (int x: A) if (x % 2 == 1) {
                ans[t] = x;
                t += 2;
            }

            return ans;
        }
    }

