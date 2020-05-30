package string;

public class CountWords {

    public static void main(String[] args) {
        String s = "Hello world, I love you cathy, LI Xin!";
        System.out.println(wordCount(s));
    }

    private static int wordCount(String s) {
        if (s == null || s.isEmpty())
            return 0;
        return s.trim().split("[\\s]+").length;
    }

}
