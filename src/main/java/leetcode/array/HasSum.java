package leetcode.array;

import java.util.Arrays;
import java.util.HashMap;

public class HasSum {

    public static boolean hasSum(int[] A, int k){
        boolean res = false;
        if(A ==  null || A.length < 2){
            return res;
        }
        Arrays.sort(A);
        int i = 0, j = A.length - 1;
        while(i < j){
            if(A[i] + A[j] ==  k){
                res = true;
                break;
            } else if( A[i] + A[j] > k){
                j--;
            }else{
                i++;
            }
        }

        return res;
    }

    public static int[] twoSum(int[] A, int k){
        int[] res = {-1, -1};
        if(A ==  null || A.length < 2){
            return res;
        }
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i = 0; i < A.length ; i++){
            hm.put(A[i], i);
        }
        for(int i = 0; i < A.length ; i++){
            if(hm.containsKey(k - A[i]) && k!= 2*A[i]){
                res[0] = i;
                res[1] = hm.get(k - A[i]);
                break;
            }
        }
        return res;
    }




    public static void main(String[] args) {

        int[] A = {1,10,5,6,9,0,4,3};
        int target = 11;
//		System.out.println(hasSum(A, target));

        int[] res = twoSum(A, target);
        for(int r : res){
            System.out.println(r);
        }


    }
}
