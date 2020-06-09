package leetcode.stack;

public class RemoveOuterParentheses {
    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        System.out.println(removeOuterParentheses(s));
    }

    public static String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();
        int leval = 0;
        for(Character c : S.toCharArray()){
            if(')'== c) leval--;
            if(leval >= 1) sb.append(c);
            if('(' == c) leval++;
        }
        return sb.toString();
    }
}
