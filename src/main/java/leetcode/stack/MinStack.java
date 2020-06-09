package leetcode.stack;

import java.util.Stack;

class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if(!minStack.isEmpty()){
            int top = minStack.peek();
            if(x < top) minStack.push(x);
        }else {
            minStack.push(x);
        }
    }

    public void pop() {
        int pop = stack.pop();
        int top = minStack.peek();
        if(top == pop){
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {

        try {
            throw new Exception("空栈无法返回最小元素");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return minStack.peek();

    }

    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();

        MinStack stack = new MinStack();
//        stack.push(1);
//        stack.push(-1);
//        stack.push(2);
//        min.stack = stack;
         System.out.println(stack.getMin());
    }
}
