package leetcode.hash;


/**
 *
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 *
 * 示例 1:
 *
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-anagram
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class IsAnagram {


    public static void main(String[] args) {
        String s = "abbcc";
        String t = "bccba";

        System.out.println(isAnagram(s,t));
    }


    /**
     * 为了检查 tt 是否是 ss 的重新排列，我们可以计算两个字符串中每个字母的出现次数并进行比较。因为 SS 和 TT 都只包含 A-ZA−Z 的字母，所以一个简单的 26 位计数器表就足够了。
     * 我们需要两个计数器数表进行比较吗？实际上不是，因为我们可以用一个计数器表计算 ss 字母的频率，用 tt 减少计数器表中的每个字母的计数器，然后检查计数器是否回到零。
     *
     * @param s
     * @param t
     * @return
     */
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] counts = new int[26];
        for (int i = 0; i < s.length() ; i++) {
            counts[s.charAt(i) - 'a'] ++;
            counts[t.charAt(i) - 'a'] --;
        }

        for(int count : counts){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
}
