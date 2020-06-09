package leetcode.array;

import java.util.Arrays;

public class Problem_1170_numSmallerByFrequency {

    public static void main(String[] args) {
        String[] queries = {"cbd"}, words = {"zaaaz"};
        System.out.println(Arrays.toString(numSmallerByFrequency(queries,words)));

    }

    public static int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int countMinQuery = countMinCode(queries[i]);
            for (String word : words) {
                if (countMinQuery < countMinCode(word)) {
                    result[i] ++;
                }
            }
        }
        return result;
    }

    /**
     * 统计最小出现频次
     * @param s
     * @return
     */
    public static int countMinCode(String s) {
        char min = s.charAt(0);
        int  count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < min) {
                min = s.charAt(i);
                count = 0;
            }
            if (s.charAt(i) == min) {
                count++;
            }
        }
        return count;
    }


}
