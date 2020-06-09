package leetcode.string;

import java.util.HashMap;
import java.util.Stack;

public class BracketsIsValid {

    private HashMap<Character,Character> mapping;

    public BracketsIsValid(){
        this.mapping = new HashMap<Character, Character>();
        mapping.put(')','(');
        mapping.put(']','[');
        mapping.put('}','{');
    }


    public static boolean isValid(String s) {
        if(s.contains("()")||s.contains("[]")||s.contains("{}")){
            return isValid(s.replace("()","").replace("[]","").replace("{}",""));
        }else {
            return "".equals(s);
        }
    }

    public boolean isValid2(String s){

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (this.mapping.containsKey(c)) {
                char topElement = stack.isEmpty() ? '#' : stack.pop();
                if (topElement != this.mapping.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "{{[{[]}]}}[]";

        BracketsIsValid jj = new BracketsIsValid();
        System.out.println(jj.isValid2(s));
    }
}
