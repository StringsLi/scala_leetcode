package leetcode.array;

public class Problem_1221_balancedStringSplit {

    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        System.out.println(balancedStringSplit(s));
    }

    public static int balancedStringSplit(String s){
        int num = 0;
        int res = 0;
        for(char c: s.toCharArray()){
            if(c == 'L') num ++;
            else num --;
            if(num == 0) res ++;
        }
        return res;
    }

}
