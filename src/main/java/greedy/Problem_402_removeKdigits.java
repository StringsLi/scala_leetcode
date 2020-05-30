package greedy;

import java.util.Stack;

/**
 *
 * 给定一个以字符串表示的非负整数 num，移除这个数中的 k 位数字，使得剩下的数字最小。
 *
 * 注意:
 *
 * num 的长度小于 10002 且 ≥ k。
 * num 不会包含任何前导零。
 * 示例 1 :
 *
 * 输入: num = "1432219", k = 3
 * 输出: "1219"
 * 解释: 移除掉三个数字 4, 3, 和 2 形成一个新的最小的数字 1219。
 * 示例 2 :
 *
 * 输入: num = "10200", k = 1
 * 输出: "200"
 * 解释: 移掉首位的 1 剩下的数字为 200. 注意输出不能有任何前导零。
 * 示例 3 :
 *
 * 输入: num = "10", k = 2
 * 输出: "0"
 * 解释: 从原数字移除所有的数字，剩余为空就是0。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-k-digits
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Problem_402_removeKdigits {

    public static void main(String[] args) {
        String num = "1432219";
        int k = 3;
        System.out.println(removeKdigits1(num,k));
    }

    public static String removeKdigits1(String num, int k) {
        Stack<Integer> stack = new Stack<>();
        String res = "";
        //遍历整个字符串
        for (int i = 0; i < num.length(); ++i){
            int number = num.charAt(i) - '0';
            //贪心算法删除数字，一个数字可以一直删
            while (!stack.empty() && stack.peek() > number && k > 0) {
                stack.pop();
                --k;
            }
            //首位不为0，或者0不在首位时，入栈
            if (number != 0 || !stack.empty())
                stack.push(number);
        }

        //k还有剩余的情况
        while (!stack.empty() && k > 0) {
            stack.pop();
            --k;
        }

        //将栈内数字输出到字符串
        while (!stack.empty()){
            res = stack.pop() + res;
        }
        return (res == "")? "0" : res;
    }

}
