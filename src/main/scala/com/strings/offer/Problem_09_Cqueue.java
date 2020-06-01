package com.strings.offer;

import java.util.Stack;

class Problem_09_Cqueue {

    Stack<Integer> stack1 ;
    Stack<Integer> stack2;
    public Problem_09_Cqueue() {
        stack1 = new Stack();
        stack2 = new Stack();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if(!stack2.empty()) return stack2.pop();
        while(!stack1.empty()) stack2.push(stack1.pop());
        if(!stack2.empty()) return stack2.pop();
        else return -1;
    }
}