package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem_830_largeGroupPositions {
    public static void main(String[] args) {
        String S = "abbxxxxzzy";
        System.out.println(largeGroupPositions(S));
        System.out.println(largeGroupPositions2(S));
    }

    public static List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> res = new ArrayList<>();
        int left = 0,right = 0;
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) - S.charAt(i-1) == 0){
                right++;
                if(right - left > 2) res.remove(res.size()-1);
                if(right - left >= 2) res.add(Arrays.asList(left,right));
            }else{
                left = i;
                right = i;
            }
        }
        return res;
    }

    public static List<List<Integer>> largeGroupPositions2(String S) {
        List<List<Integer>> res = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < S.length(); i++) {
            if (i == S.length() - 1 || S.charAt(i) != S.charAt(i + 1)) {
                if (i - j >= 2) res.add(Arrays.asList(j, i));
                j = i + 1;
            }
        }
        return res;
    }

}
