package string;

public class CountChar {

    public static void main(String[] args) {
        String str = "Hello 1";
        System.out.println(CountCharacters(str));
    }

    private static int CountCharacters(String str) {
        int count = 0;
        if (str == "" || str == null) {
            return 0;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
