package leetcode.string;

public class Problem_551_checkRecord {

    public static void main(String[] args) {
        String s = "LLPPPLL";
        System.out.println(checkRecord(s));
    }

    public static boolean checkRecord(String s) {
        int countA = 0;
        for (int i = 0; i < s.length() && countA < 2; i++) {
            if (s.charAt(i) == 'A')
                countA++;
            if (i <= s.length() - 3 && s.charAt(i) == 'L' && s.charAt(i + 1) == 'L' && s.charAt(i + 2) == 'L')
                return false;
        }
        return countA < 2;

    }
}
