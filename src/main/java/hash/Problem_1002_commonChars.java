package hash;

import java.util.ArrayList;
import java.util.List;

public class Problem_1002_commonChars {

    public static void main(String[] args) {
        String[] A = {"bella","label","roller"};
        System.out.println(commonChars(A));
    }

    public static List<String> commonChars(String[] A) {
        List<String> lst = new ArrayList<>();
        int[] freqMin = new int[26];
        for (int i = 0; i < 26; i++) {
            freqMin[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < A.length ; i++) {
            int[] freqI = freqCount(A[i]);
            for (int j = 0; j < freqI.length ; j++) {
                if(freqI[j] < freqMin[j]){
                    freqMin[j] = freqI[j];
                }
            }
        }

        for (int i = 0; i < freqMin.length; i++) {
            if(freqMin[i] > 0 ){
                inset2List(lst,String.valueOf((char)(i+'a')),freqMin[i]);
            }
        }

        return lst;
    }

    public static void inset2List(List<String> lst, String s, int times){
        for (int i = 0; i < times ; i++) {
            lst.add(s);
        }
    }

    public static int[] freqCount(String chars){
        int[] freqs = new int[26];
        for(char chr:chars.toCharArray()){
            freqs[chr-'a']++;
        }

        return freqs;
    }
}
