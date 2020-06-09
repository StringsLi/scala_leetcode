package leetcode.greedy;

import java.util.Arrays;

public class Problem_455_findContentChildren {

    public static void main(String[] args) {
        int[] g = {1,2,3}, s = {1,1};

        System.out.println(findContentChildren(g,s));
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int childIndex = 0,cookieIndex = 0, count = 0;
        while (childIndex < g.length && cookieIndex < s.length){
            if(g[childIndex] <= s[cookieIndex]){
                count ++;
                childIndex ++;
            }
            cookieIndex++;
        }
        return count;
    }
}
