package math;

public class Problem_191_hammingWeight {

    public static void main(String[] args) {
        int n = 00000000000000000000000010000000;
        System.out.println(hammingWeight(n));
    }

    public static int hammingWeight(int n) {
        int bits = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) {
                bits++;
            }
            mask <<= 1;
        }
        return bits;
    }
}
