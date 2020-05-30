package string;

import java.util.Stack;

/**
 * 给定一个字符串 S，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，而所有字母的位置发生反转。
 *
 *  
 *
 * 示例 1：
 *
 * 输入："ab-cd"
 * 输出："dc-ba"
 * 示例 2：
 *
 * 输入："a-bC-dEf-ghIj"
 * 输出："j-Ih-gfE-dCba"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-only-letters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Problem_917_reverseOnlyLetters {

    public static void main(String[] args) {
        String S = "Test1ng-Leet=code-Q!";
        System.out.println(reverseOnlyLetters(S));
        System.out.println(reverseOnlyLetters2(S));
    }

    public static String reverseOnlyLetters(String S){
        Stack<Character> stack = new Stack<>();
        for(char c:S.toCharArray()){
            if(Character.isLetter(c)){
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char c:S.toCharArray()){
            if(Character.isLetter(c)){
                sb.append(stack.pop());
            }else{
                sb.append(c);
            }
        }

        return sb.toString();

    }

    public static String reverseOnlyLetters2(String S){

        StringBuilder sb = new StringBuilder();
        int j = S.length() - 1;

        for (int i = 0; i < S.length(); i++) {
            if(Character.isLetter(S.charAt(i))){
                while (!Character.isLetter(S.charAt(j))){
                    j--;
                }
                sb.append(S.charAt(j--));
            }else{
                sb.append(S.charAt(i));
            }
        }

        return sb.toString();

    }
}
