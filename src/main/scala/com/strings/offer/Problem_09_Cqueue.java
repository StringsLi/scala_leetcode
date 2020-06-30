package com.strings.offer;

import java.util.Stack;

/**
 * 设计栈 A 用于加入队尾操作，栈 B 用于将元素倒序，从而实现删除队首元素。
 *
 * 加入队尾 appendTail()函数： 将数字 val 加入栈 A 即可。
 * 删除队首deleteHead()函数： 有以下三种情况。
 * 当栈 B 不为空： B中仍有已完成倒序的元素，因此直接返回 B 的栈顶元素。
 * 否则，当 A 为空： 即两个栈都为空，无元素，因此返回 -1−1 。
 * 否则： 将栈 A 元素全部转移至栈 B 中，实现元素倒序，并返回栈 B 的栈顶元素。
 *
 */

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