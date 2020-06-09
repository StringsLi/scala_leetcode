package leetcode.string;

public class Problem_434_countSegments {

    public static void main(String[] args) {
        String s = "Hi, my name is lixin";
        System.out.println(countSegments(s));
        System.out.println(countSegments2(s));
    }

    public static int countSegments(String s){
        String trimed = s.trim();
        if("".equals(trimed) || trimed == null){
            return 0;
        }
        return trimed.split("\\s+").length;
    }

    public static  int countSegments2(String s) {
        int segmentCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 || s.charAt(i-1) == ' ') && s.charAt(i) != ' ') {
                segmentCount++;
            }
        }
        return segmentCount;
    }


}
