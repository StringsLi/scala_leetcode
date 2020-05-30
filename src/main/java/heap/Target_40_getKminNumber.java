package heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Target_40_getKminNumber {

    public static void main(String[] args) {
        int[] arr = {3,2,1};
        System.out.println(Arrays.toString(getLeastNumbers(arr,2)));
    }


    public static int[] getLeastNumbers(int[] arr, int k) {
        if(k == 0) return new int[0];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a,b) -> (b - a));
        for(int i: arr){
            if(priorityQueue.size() < k){
                priorityQueue.add(i);
            }else{
                if(priorityQueue.peek() > i){
                    priorityQueue.remove();
                    priorityQueue.add(i);
                }
            }
        }

        int[] res = new int[k];
        int count = 0;
        while (priorityQueue.size() > 0){
            res[count++] = priorityQueue.remove();
        }
        return res;
    }
}
