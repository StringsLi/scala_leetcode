package stack;

import java.util.Stack;

public class RemoveDuplicates {

    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates2(s));
    }


    public static String removeDuplicates2(String S) {

        Stack<Character> stack = new Stack<>();
        for (Character character:S.toCharArray()) {
            if(stack.empty() || stack.peek() != character){
                stack.push(character);
            }else{
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        for(Character  c: stack){
            sb.append(c);
        }
        return sb.toString();

    }

    public static String removeDuplicates(String S) {
        StringBuilder sb = new StringBuilder();
        int length = 0;
        for(Character c : S.toCharArray()){
            if(length != 0 && c == sb.charAt(length - 1)){
                length--;
                    sb.deleteCharAt( length- 1);
            }else{
                sb.append(c);
                length ++;
            }

        }
        return sb.toString();
    }
}
