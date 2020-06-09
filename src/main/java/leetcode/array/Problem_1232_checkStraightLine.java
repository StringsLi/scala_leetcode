package leetcode.array;

public class Problem_1232_checkStraightLine {
    public static void main(String[] args) {
        int[][] cor = {{1,2},{2,3},{3,4}};
        int[][] cor2 = {{1,2},{2,4},{3,4}};
        System.out.println(checkStraightLine(cor));
        System.out.println(checkStraightLine(cor2));

    }


    public static boolean checkStraightLine(int[][] coordinates) {
        int size = coordinates.length;
        if(size == 2) return true;
        int x0 = coordinates[0][0],y0 = coordinates[0][1];
        double[] flag = new double[size - 1];
        for (int i = 1; i < size ; i++) {
            int[] arr_i = coordinates[i];
            if(arr_i[0] - x0 == 0) flag[i-1] = Double.MAX_VALUE;
            else  flag[i-1] =(double)(arr_i[1] - y0)/(arr_i[0] - x0);
        }

        for (int i = 1; i < flag.length ; i++) {
            if(flag[i] != flag[0]) return false;
        }

        return true;
    }
}
