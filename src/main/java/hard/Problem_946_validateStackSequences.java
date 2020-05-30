package hard;

import java.util.Stack;

public class Problem_946_validateStackSequences {

    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for(int x: pushed){
            stack.add(x);
            while (stack.size() > 0 && j < popped.length && stack.get(stack.size()-1) == popped[j]){
                stack.pop();
                j++;
            }
        }

        return stack.size() == 0;
    }

    public static void main(String[] args) {
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,5,3,1,2};
        System.out.println(validateStackSequences(pushed,popped));
    }
}
