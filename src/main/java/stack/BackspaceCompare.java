package stack;

import java.util.Stack;

public class BackspaceCompare {

    public static void main(String[] args) {
        String s = "ab##";
        String t = "a#d#";
        System.out.println(backspaceCompare(s,t));
//        System.out.println(convert("abc##"));
//        System.out.println(convert("bcc##"));
    }

    public static boolean backspaceCompare(String T, String S){
        return convert(S).equals(convert(T));
    }

    public static String build(String S) {
        Stack<Character> ans = new Stack();
        for (char c: S.toCharArray()) {
            if (c != '#')
                ans.push(c);
            else if (!ans.empty())
                ans.pop();
        }
        return String.valueOf(ans);
    }

    private static String convert(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length() ; i++) {
            if(!stack.empty() &&s.charAt(i) == '#'){
                stack.pop();
            }else if(stack.empty()&&s.charAt(i)=='#'){
                continue;
            }else{
                stack.push(s.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();
        for(Character c: stack){
            sb.append(c);
        }

        return sb.toString();
    }
}
