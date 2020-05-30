package string;

import java.util.Arrays;

public class Problem_557_reverseWords {

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String words[] = s.split(" ");
        String words2[] = s.split("\\+");
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(words2));
        StringBuilder res=new StringBuilder();
        for (String word: words)
            res.append(new StringBuffer(word).reverse().toString() + " ");
        return res.toString().trim();
    }

}
