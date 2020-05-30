package string;

public class Problem_657_judgeCircle {

    public boolean judgeCircle(String moves){
        int num_vertical = 0;
        int num_horizontal = 0;
        for(char c: moves.toCharArray()){
            if(c == 'R') num_horizontal ++;
            if(c == 'L') num_horizontal --;
            if(c == 'U') num_vertical ++;
            if(c == 'D') num_vertical --;
        }
        if(Math.abs(num_horizontal) + Math.abs(num_vertical)== 0)
            return true;
        else
            return false;
    }
}
