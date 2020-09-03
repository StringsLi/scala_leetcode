package interview;

import java.util.HashSet;
import java.util.Set;

public class Problem_0101_isUnique {

    public boolean isUnique(String astr) {
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < astr.length();i++){
            set.add(astr.charAt(i));
        }

        return set.size() == astr.length();
    }
}
