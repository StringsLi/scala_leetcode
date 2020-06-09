package leetcode.bitwise;

public class Problem_461_hammingDistance {

    public static void main(String[] args) {
        System.out.println(hammingDistance2(1,4));
    }

    public static int hammingDistance(int x, int y){
        int diffBits = x ^ y;
        return Integer.bitCount(diffBits);

    }

    public static int hammingDistance2(int x, int y) {
        int i = x ^ y;
        String s = Integer.toBinaryString(i);
        System.out.println(s);
        int cnt = 0;
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == '1'){
                cnt++;
            }
        }
        return cnt;
    }

}
