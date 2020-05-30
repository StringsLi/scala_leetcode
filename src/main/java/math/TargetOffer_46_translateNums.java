package math;

public class TargetOffer_46_translateNums {

    public static void main(String[] args) {
        int num = 12258;
        System.out.println(translateNum(num));
    }

    public static int translateNum(int num) {
        char[] sc = String.valueOf(num).toCharArray();
        int n = sc.length;
        int[] f = new int[n + 1];
        f[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (sc[i - 1] >= '0' && sc[i - 1] <= '9') {
                f[i] += f[i - 1];
            }
            if (i > 1) {
                int a = (sc[i - 2] - '0') * 10 + (sc[i - 1] - '0');
                if (a >= 10 && a <= 25) {
                    f[i] += f[i - 2];
                }
            }
        }
        return f[n];
    }


}
