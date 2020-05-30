package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Problem_77_combine {
    public static void main(String[] args) {
        Problem_77_combine pb = new Problem_77_combine();
        System.out.println(pb.combine(4,2));
    }

    public List<List<Integer>> combine(int n,int k) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res,new ArrayList<>(),k,n,1);
        return res;
    }

    private void backtrack(List<List<Integer>> res, List<Integer> list,int k,int n,int start){
        if(n < 0 || list.size() > k) return;
        else if(list.size() ==  k) res.add(new ArrayList<>(list));
        else{
            for (int i = start; i <= n ; i++) {
                if(i > start && i == i - 1) continue;
                list.add(i);
                backtrack(res,list,k,n,i+1);
                list.remove(list.size() - 1);
            }
        }
    }
}
