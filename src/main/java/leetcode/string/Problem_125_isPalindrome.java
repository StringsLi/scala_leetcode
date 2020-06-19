package leetcode.string;

public class Problem_125_isPalindrome {
    public static void main(String[] args) {
        String s = "./";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s){
        if(s == null || "".equals(s)){
            return true;
        }
        int left = 0, right = s.length() - 1;
        while (left < right){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left ++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
