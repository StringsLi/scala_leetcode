package hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem_1078_findOcurrences {

    public static void main(String[] args) {
        String text = "alice is a good girl she is a good student", first = "a", second = "good";
        System.out.println(Arrays.toString(findOcurrences(text,first,second)));

    }

    public static String[] findOcurrences(String text, String first, String second) {

        String[] textArr = text.split("\\s+");
        List<String> lst = new ArrayList<>();
        for (int i = 0; i < textArr.length -2; i++) {
            if(textArr[i].equals(first) && textArr[i+1].equals(second)){
                lst.add(textArr[i+2]);
            }
        }

        String[] array = new String[lst.size()];
        array = lst.toArray(array);

        return array;
    }
}
