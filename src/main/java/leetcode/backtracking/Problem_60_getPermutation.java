package leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Problem_60_getPermutation {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        Problem_60_getPermutation pb = new Problem_60_getPermutation();
        System.out.println(pb.getPermutation(4,9));
    }

    public String getPermutation(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        backtracking(list, new ArrayList<>(), n);
        return list.get(k-1).toString().replace(", ","").replace("[","").replace("]","");
    }

    private void backtracking(List<List<Integer>> list, List<Integer> tempList, int n){
        if(tempList.size() == n){  //已将全部数选出，满足条件加入结果集，结束递归
            list.add(new ArrayList<>(tempList));
        } else{
            for(int i = 1; i <= n; i++){
                if(tempList.contains(i)) continue; // 已经选过的数不再选
                tempList.add(i);  //选择当前节点
                backtracking(list, tempList, n);  //递归
                tempList.remove(tempList.size() - 1); //回溯到上一步，去掉当前节点
            }
        }
    }

}
