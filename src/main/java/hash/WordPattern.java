package hash;

import java.util.HashMap;

public class WordPattern {

    public static void main(String[] args) {
        String s1 = "abba";
        String s2 = "dog cat cat dog";
        System.out.println(string2Num2(s2));
        System.out.println(string2Num(s1));

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

    public static String string2Num2(String s){
        HashMap<String,Integer> map = new HashMap<>();
        int count = 1;
        StringBuilder sb = new StringBuilder();
        String[] kk = s.split(" ");
        for (int i = 0; i < kk.length ; i++) {
            map.put(kk[i],count);
            count++;
        }
        for(String str : kk){
            sb.append(map.get(str));
        }
        return sb.toString();
    }
}
