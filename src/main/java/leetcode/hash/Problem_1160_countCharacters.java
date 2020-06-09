package leetcode.hash;

public class Problem_1160_countCharacters {

    public static void main(String[] args) {
        String[] words = {"hello","world","leetcode"};
        String chars = "welldonehoneyr";

        System.out.println(countCharacters(words,chars));
    }


    public static int countCharacters(String[] words, String chars) {
        if(words.length==0||chars.length()==0) return 0;
        int[] charsCount = freqCount(chars);

        int res = 0;
        for (int i = 0; i < words.length; i++) {
            boolean flag=false;
            int[] i_count = freqCount(words[i]);
            for (int j = 0; j < i_count.length ; j++) {
                if(i_count[j] > charsCount[j]){
                    flag = true;
                    break;
                }
            }
            if (flag == true) continue;
            res += words[i].length();
        }
        return res;
    }

    public static int[] freqCount(String chars){
        int[] freqs = new int[26];
        for(char chr:chars.toCharArray()){
            freqs[chr-'a']++;
        }

        return freqs;
    }
}
