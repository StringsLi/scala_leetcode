package leetcode.string;

public class ReverseString {

    public static void reverseString(char[] s){
        int left = 0;
        int right = s.length - 1;
        while (left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] s = {'a','b','c'};
        reverseString(s);

        for (int i = 0; i < s.length ; i++) {
            System.out.println(s[i]);

        }
    }
}
