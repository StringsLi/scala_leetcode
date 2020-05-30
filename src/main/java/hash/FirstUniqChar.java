package hash;

/**
 *
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * 案例:
 * s = "leetcode"
 * 返回 0.
 *
 * s = "loveleetcode",
 * 返回 2.
 *  
 *
 * 注意事项：您可以假定该字符串只包含小写字母。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/first-unique-character-in-a-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class FirstUniqChar {

    public static void main(String[] args) {
        String s = "leetcode";
        String s2 = "loveleetcode";
//        System.out.println(Arrays.toString(calcFreq(s)));
        System.out.println(firstUniqChar(s2));
    }

    public static int firstUniqChar(String s) {
        int[] count = calcFreq(s);
        for (int i = 0; i < s.length(); i++) {
            if(count[s.charAt(i)-'a'] == 1){
                return i;
            }
        }
        return -1;
    }

    public static int[] calcFreq(String s){
        int[] count = new int[26];
        for(char c:s.toCharArray()){
            count[c-'a']++;  //c-'a'也就是求当前字符和'a'的ASCII码之差. 也就得到了字符在letter[]数组中的下标
        }
        return count;
    }
}
