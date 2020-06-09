package leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Problem_46_permute {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        Problem_46_permute pb = new Problem_46_permute();
        System.out.println(pb.permute(nums));
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtracking(list, new ArrayList<>(), nums);
        return list;
    }

    private void backtracking(List<List<Integer>> list, List<Integer> tempList, int [] nums){
        if(tempList.size() == nums.length){  //已将全部数选出，满足条件加入结果集，结束递归
            list.add(new ArrayList<>(tempList));
        } else{
            for(int i = 0; i < nums.length; i++){
                if(tempList.contains(nums[i])) continue; // 已经选过的数不再选
                tempList.add(nums[i]);  //选择当前节点
                backtracking(list, tempList, nums);  //递归
                tempList.remove(tempList.size() - 1); //回溯到上一步，去掉当前节点
            }
        }
    }

}
