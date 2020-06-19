package leetcode.string;

public class Problem_521_findLUSlength {

    public int findLUSlength(String a, String b) {
        if(a.equals(b)) return -1;
        return Math.max(a.length(),b.length());

    }
}
