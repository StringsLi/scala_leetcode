package string;

/**
 * 你正在和你的朋友玩 猜数字（Bulls and Cows）游戏：你写下一个数字让你的朋友猜。每次他猜测后，你给他一个提示，告诉他有多少位数字和确切位置都猜对了（称为“Bulls”, 公牛），有多少位数字猜对了但是位置不对（称为“Cows”, 奶牛）。你的朋友将会根据提示继续猜，直到猜出秘密数字。
 *
 * 请写出一个根据秘密数字和朋友的猜测数返回提示的函数，用 A 表示公牛，用 B 表示奶牛。
 *
 * 请注意秘密数字和朋友的猜测数都可能含有重复数字。
 *
 * 示例 1:
 *
 * 输入: secret = "1807", guess = "7810"
 *
 * 输出: "1A3B"
 *
 * 解释: 1 公牛和 3 奶牛。公牛是 8，奶牛是 0, 1 和 7。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/bulls-and-cows
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */


public class Problem_299_getHint {

    public static void main(String[] args) {
        String secret = "1807", guess = "7810";
        System.out.println(getHint(secret,guess));
    }

    public static String getHint(String secret, String guess) {
        int Acount = 0,Bcount = 0;
        for (int i = 0; i < secret.length(); i++) {
            if(secret.charAt(i) == guess.charAt(i)) Acount++;
        }
        int[] secretCount = freqCount(secret);
        int[] guessCount = freqCount(guess);

        for (int i = 0; i < secretCount.length ; i++) {
            Bcount += Math.min(secretCount[i],guessCount[i]);
        }
        return Acount +"A" +(Bcount-Acount) +"B";

    }

    public static int[] freqCount(String S){
        int[] freqs = new int[10];
        for(char chr:S.toCharArray()){
            freqs[chr - '0']++;
        }
        return freqs;
    }
}
