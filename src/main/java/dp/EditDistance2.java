package dp;

/**
 * A DynamicProgramming based solution for Edit Distance problem In Java
 * Description of Edit Distance with an Example:
 * <p>
 * Edit distance is a way of quantifying how dissimilar two strings (e.g., words) are to one another,
 * by counting the minimum number of operations required to transform one string into the other. The
 * distance operations are the removal, insertion, or substitution of a character in the string.
 * <p>
 * <p>
 * The Distance between "kitten" and "sitting" is 3. A minimal edit script that transforms the former into the latter is:
 * <p>
 * kitten → sitten (substitution of "s" for "k")
 * sitten → sittin (substitution of "i" for "e")
 * sittin → sitting (insertion of "g" at the end).
 *
 * @author SUBHAM SANGHAI
 **/

import java.util.Scanner;

public class EditDistance2 {

    public static int minDistance(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int[][] dp = new int[len1 + 1][len2 + 1];
        for (int i = 0; i <= len1; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= len2; j++) {
            dp[0][j] = j;
        }
        for (int i = 0; i < len1; i++) {
            char c1 = word1.charAt(i);
            for (int j = 0; j < len2; j++) {
                char c2 = word2.charAt(j);
                if (c1 == c2) {
                    dp[i + 1][j + 1] = dp[i][j];
                } else {
                    dp[i + 1][j + 1] = Math.min(Math.min(dp[i][j],dp[i][j+1]),dp[i+1][j]) +1 ;
                }
            }
        }
        return dp[len1][len2];
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1, s2;
        System.out.println("Enter the First String");
        s1 = input.nextLine();
        System.out.println("Enter the Second String");
        s2 = input.nextLine();
        //ans stores the final Edit Distance between the two strings
        int ans = minDistance(s1, s2);
        System.out.println("The minimum Edit Distance between \"" + s1 + "\" and \"" + s2 + "\" is " + ans);
    }
}
