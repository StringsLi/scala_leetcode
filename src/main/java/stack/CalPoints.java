package stack;

import java.util.Stack;

public class CalPoints {

    public static void main(String[] args) {
        String[] ops = {"5","2","C","D","+"};
        System.out.println(calPoints(ops
        ));
    }

    public  static  int calPoints(String[] ops){
        Stack<Integer> stack = new Stack<>();
        for(String s: ops){
            if("+".equals(s)){
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            }else if("C".equals(s)){
                stack.pop();
            }else if("D".equals(s)){
                stack.push(2 * stack.peek());
            }else {
                stack.push(Integer.parseInt(s));
            }
        }

        int sum = 0;

        for(Integer i : stack){
            sum += i;
        }
        return sum;
    }
}
