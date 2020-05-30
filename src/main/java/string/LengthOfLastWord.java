package string;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s){
        s = s.trim();
        int index = s.lastIndexOf(" ") + 1;
        return s.substring(index).length();

    }

    public static void main(String[] args) {
        String str1 = "Hello world";
        String str2 = "Hollo wwjj ";
        String str3 = "Hello";

        System.out.println(lengthOfLastWord(str1));
        System.out.println(lengthOfLastWord(str2));
        System.out.println(lengthOfLastWord(str3));
    }
}
