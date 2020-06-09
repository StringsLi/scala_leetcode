package leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem_42_combinationSumII {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        Problem_42_combinationSumII pb = new Problem_42_combinationSumII();
        System.out.println(pb.combinationSum2(candidates,7));
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res,new ArrayList<>(),candidates,target,0);
        return res;
    }

    /**
     *  去重
     * @param res
     * @param list
     * @param candidates
     * @param target
     */
    private void backtrack(List<List<Integer>> res, List<Integer> list,int[] candidates,int target,int start){
        if(target < 0) return;
        else if(target == 0) res.add(new ArrayList<>(list));
        else{
            for (int i = start; i < candidates.length ; i++) {
                if(i > start && candidates[i] == candidates[i-1]) continue;
                list.add(candidates[i]);
                backtrack(res,list,candidates,target - candidates[i],i+1);
                list.remove(list.size() - 1);
            }
        }
    }
}
