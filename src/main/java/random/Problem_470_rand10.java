package random;

import java.util.Random;

public class Problem_470_rand10 {

    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            System.out.println(rand10_2());
        }
    }

    public static int rand10(){
        int row,col,idx;
        do{
            row = rand7();
            col = rand7();
            idx = col + (row - 1) * 7;
        }while (idx > 40);

        return 1 + (idx - 1) % 10;
    }

    public static int rand10_2(){
        while (true){
            int index = rand7() + (rand7() - 1) * 7;
            if(index <= 40) return index%10 + 1;
        }
    }

    public static int rand7(){
        Random rng = new Random();
        return rng.nextInt(7) + 1;
    }
}
