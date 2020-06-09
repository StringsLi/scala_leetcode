package leetcode.math;

/**
 * 8. 字符串转换整数 (atoi)
 * 请你来实现一个 atoi 函数，使其能将字符串转换成整数。
 *
 * 首先，该函数会根据需要丢弃无用的开头空格字符，直到寻找到第一个非空格的字符为止。
 *
 * 当我们寻找到的第一个非空字符为正或者负号时，则将该符号与之后面尽可能多的连续数字组合起来，作为该整数的正负号；假如第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成整数。
 *
 * 该字符串除了有效的整数部分之后也可能会存在多余的字符，这些字符可以被忽略，它们对于函数不应该造成影响。
 *
 * 注意：假如该字符串中的第一个非空格字符不是一个有效整数字符、字符串为空或字符串仅包含空白字符时，则你的函数不需要进行转换。
 *
 * 在任何情况下，若函数不能进行有效的转换时，请返回 0。
 *
 * 说明：
 *
 * 假设我们的环境只能存储 32 位大小的有符号整数，那么其数值范围为 [−231,  231 − 1]。如果数值超过这个范围，请返回  INT_MAX (231 − 1) 或 INT_MIN (−231) 。
 */

public class Problem_8_myAtoi {

    public static void main(String[] args) {
        String str = "   -42";
        System.out.println(myAtoi(str));
    }

    public static int myAtoi(String str) {
        int len = str.length();

        // 去除前导空格
        int index = 0;
        while (index < len) {
            if (str.charAt(index) != ' ') {
                break;
            }
            index++;
        }

        if (index == len) {
            return 0;
        }

        // 第 1 个字符如果是符号，判断合法性，并记录正负
        int sign = 1;
        char firstChar = str.charAt(index);
        if (firstChar == '+') {
            index++;
            sign = 1;
        } else if (firstChar == '-') {
            index++;
            sign = -1;
        }

        // 不能使用 long 类型，这是题目说的
        int res = 0;
        while (index < len) {
            char currChar = str.charAt(index);
            // 判断合法性
            if (currChar > '9' || currChar < '0') {
                break;
            }

            // 题目中说：环境只能存储 32 位大小的有符号整数，因此，需要提前判断乘以 10 以后是否越界
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && (currChar - '0') > Integer.MAX_VALUE % 10)) {
                return Integer.MAX_VALUE;
            }
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && (currChar - '0') > -(Integer.MIN_VALUE % 10))) {
                return Integer.MIN_VALUE;
            }

            // 每一步都把符号位乘进去
            res = res * 10 + sign * (currChar - '0');
            index++;
        }

        return res;
    }

}
