package math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SubSetWithoutDup {

    public static void main(String[] args) {
        SubSetWithoutDup solution = new SubSetWithoutDup();
        int[] nums = {1, 2, 2};
        List<List<Integer>> subsets = solution.subsets(nums);
        subsets.forEach(System.out::println);
    }

    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0, nums, res, new ArrayList<>());
        return res;
    }

    private void backtrack(int i, int[] nums, List<List<Integer>> res, ArrayList<Integer> tmp) {
        res.add(new ArrayList<>(tmp));
        for (int j = i; j < nums.length; j++) {
            if(j > i && nums[j] == nums[j-1]){
                continue;
            }
            tmp.add(nums[j]);
            backtrack(j + 1, nums, res, tmp);
            tmp.remove(tmp.size() - 1);
        }
    }
}

