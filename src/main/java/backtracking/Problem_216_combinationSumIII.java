package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem_216_combinationSumIII {
    public static void main(String[] args) {
        Problem_216_combinationSumIII pb = new Problem_216_combinationSumIII();
        System.out.println(pb.combinationSum3(3,9));
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res,new ArrayList<>(),k,n,1);
        return res;
    }

    private void backtrack(List<List<Integer>> res, List<Integer> list,int k,int n,int start){
        if(n < 0 || list.size() > k) return;
        else if(n == 0 &&  list.size() ==  k) res.add(new ArrayList<>(list));
        else{
            for (int i = start; i < 10 ; i++) {
                list.add(i);
                backtrack(res,list,k,n - i,i+1);
                list.remove(list.size() - 1);
            }
        }
    }
}
