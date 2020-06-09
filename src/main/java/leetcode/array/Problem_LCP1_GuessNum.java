package leetcode.array;

public class Problem_LCP1_GuessNum {

    public static void main(String[] args) {
        int[] guess = {1,2,3};
        int[] answer = {1,2,3};
        System.out.println(game(guess,answer));
    }

    public static int game(int[] guess, int[] answer) {
        int count = 0;
        for (int i = 0; i < guess.length ; i++) {
            if(guess[i] - answer[i] == 0) count++;
        }
        return count;
    }

}
