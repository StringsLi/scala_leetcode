package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem_47_permuteUnique {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        Problem_47_permuteUnique pb = new Problem_47_permuteUnique();
        System.out.println(pb.permuteUnique(nums));
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        Arrays.sort(nums);
        backtracking(ret,new ArrayList<>(),nums,new boolean[nums.length]);
        return ret;
    }

    public void backtracking(List<List<Integer>> ret, List<Integer> list, int[] nums, boolean[] used) {
        if(list.size()==nums.length) {
            ret.add(new ArrayList<>(list));
        }
        for(int i=0;i<nums.length;i++) {
//            重复元素只按顺序选择，若当前元素未被选择且前一元素与当前元素值相等也未被选择则跳过，这一可能情况与先选小序号后选大序号的相同元素相同
            if(used[i] || i>0 && nums[i]==nums[i-1] && !used[i-1]) continue;
            used[i]=true;
            list.add(nums[i]); //选择当前点
            backtracking(ret,list,nums,used); //递归
            used[i]=false;
            list.remove(list.size()-1); //回溯到上一步，去掉当前节点
        }
    }

}
