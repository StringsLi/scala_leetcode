package hash;

/**
 * 给你一个字符串 text，你需要使用 text 中的字母来拼凑尽可能多的单词 "balloon"（气球）。
 *
 * 字符串 text 中的每个字母最多只能被使用一次。请你返回最多可以拼凑出多少个单词 "balloon"。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-number-of-balloons
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Problem_1189_maxNumberOfBalloons {

    public static void main(String[] args) {
        String text = "leetcode";

        System.out.println(maxNumberOfBalloons(text));
    }

    public static int maxNumberOfBalloons(String text) {
        int[] freqs = new int[26];
        for(char chr:text.toCharArray()){
            freqs[chr-'a']++;
        }

        String strBol = "balon";
        int min = Integer.MAX_VALUE;
        for(char c:strBol.toCharArray()){
            int count = (c == 'o' || c == 'l')? (int)Math.floor(freqs[c-'a']/2):freqs[c-'a'];
            if(count < min){
                min = count;
            }
        }

        return min;
    }
}
