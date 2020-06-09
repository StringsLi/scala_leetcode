package leetcode.hash;

import java.util.HashMap;

public class IsIsomorphic {

    public static void main(String[] args) {
        String s = "abbc";
        String s2 = "addc";
        System.out.println(string2Num(s));
        System.out.println(string2Num(s2));
        System.out.println(isIsomorphicHelper(s2));

    }

    public boolean isIsomorphic(String s, String t) {
        return string2Num(s).equals(string2Num(t));
    }



    public static String string2Num(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length() ; i++) {
            map.put(s.charAt(i),count);
            count++;
        }

        for(Character character:s.toCharArray()){
            sb.append(map.get(character));
        }
        return sb.toString();

    }

    /**
     *  char对应int位置。
     * @param s
     * @return
     */
    private static  String isIsomorphicHelper(String s) {
        int[] map = new int[128];
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            //当前字母第一次出现,赋值
            if (map[c] == 0) {
                map[c] = count;
                count++;
            }
            sb.append(map[c]);
        }
        return sb.toString();
    }

}
