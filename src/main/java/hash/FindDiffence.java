package hash;

public class FindDiffence {

    public static void main(String[] args) {


    }

    public static char findTheDifference(String s, String t) {
        int result = 0;
        for (Character c : s.toCharArray()) {
            result^=c;
        }

        for (Character c : t.toCharArray()) {
            result^=c;
        }
        return (char)result;
    }

}
