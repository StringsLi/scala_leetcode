package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Problem_39_combinationSum {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        Problem_39_combinationSum pb = new Problem_39_combinationSum();
        System.out.println(pb.combinationSum(candidates,7));
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res,new ArrayList<>(),candidates,target,0);
        return res;
    }

    private void backtrack1(List<List<Integer>> res, List<Integer> list,int[] candidates,int target){
        if(target < 0) return;
        else if(target == 0) res.add(new ArrayList<>(list));
        else{
            for (int i = 0; i < candidates.length ; i++) {
                list.add(candidates[i]);
                backtrack1(res,list,candidates,target - candidates[i]);
                list.remove(list.size() - 1);
            }
        }
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
                list.add(candidates[i]);
                backtrack(res,list,candidates,target - candidates[i],i);
                list.remove(list.size() - 1);
            }
        }
    }
}
