package leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Target_38_permutation {

    public static void main(String[] args) {
        String s = "abc";
        Target_38_permutation pb = new Target_38_permutation();
        System.out.println(Arrays.toString(pb.permute(s)));
    }

    public static char[] trans(List<Character> res){
        char[] chars = new char[res.size()];
        for (int i = 0; i < chars.length ; i++) {
            chars[i] = res.get(i);
        }
        return chars;
    }

    public String[] permute(String s) {
        char[] nums = s.toCharArray();
        List<List<Character>> list = new ArrayList<>();
        backtracking(list, new ArrayList<>(), nums);

        String[] res = new String[list.size()];
        for (int i = 0; i < res.length ; i++) {
            res[i] = String.valueOf(trans(list.get(i)));
        }

        return res;
    }

    private void backtracking(List<List<Character>> list, List<Character> tempList, char[] nums){
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
