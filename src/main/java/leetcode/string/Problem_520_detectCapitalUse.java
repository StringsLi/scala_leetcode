package leetcode.string;

public class Problem_520_detectCapitalUse {

    public static void main(String[] args) {
        String word1 = "Flag";
        String word2 = "falg";
        String word3 = "FlaG";
        System.out.println(detectCapitalUse(word1));
        System.out.println(detectCapitalUse(word2));
        System.out.println(detectCapitalUse(word3));

    }

    public static boolean detectCapitalUse(String word){
        int size = word.length();
        int lowerCount = 0,upperCount = 0;
        for (int i = 1; i < size ; i++) {
            if(Character.isUpperCase(word.charAt(i))){
                upperCount++;
            }else {
                lowerCount++;
            }
        }
        //首字母为大写
        if(Character.isUpperCase(word.charAt(0))){
            if(upperCount == size - 1) return true;
            if(lowerCount == size - 1) return true;
        }
        //首字母为小写
        if(Character.isLowerCase(word.charAt(0))){
            if(lowerCount == size - 1) return true;
        }

        return false;
    }
}
