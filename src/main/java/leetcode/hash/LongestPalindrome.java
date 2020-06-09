package leetcode.hash;

public class LongestPalindrome {

    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }

        public static int longestPalindrome(String s) {
            int[] count = new int[128];
            for (char c: s.toCharArray())
                count[c]++;

            int ans = 0;
            for (int v: count) {
                ans += v / 2 * 2;
                if (v % 2 == 1 && ans % 2 == 0)
                    ans++;
            }
            return ans;
        }

}
