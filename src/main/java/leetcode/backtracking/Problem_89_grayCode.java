package leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Problem_89_grayCode {

    public static void main(String[] args) {
        System.out.println(grayCode(2));
    }

    public static List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<Integer>() {{ add(0); }};
        int head = 1;
        for (int i = 0; i < n; i++) {
            for (int j = res.size() - 1; j >= 0; j--)
                res.add(head + res.get(j));
            head <<= 1;
        }
        return res;
    }
}
