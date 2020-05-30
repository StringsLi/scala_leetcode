package string;

public class Problem_151_reverseWords {

    public static void main(String[] args) {
        String s = "  Hello World!  ";
        String s1 = "a good   example";
        System.out.println(reverseWords(s));
        System.out.println(reverseWords(s1));
    }

    public static String reverseWords(String s){
        String trimed = s.trim();
        String[] split = trimed.split("\\s+");
        String[] res = new String[split.length];
        int j = 0;
        for (int i = split.length-1; i >=0 ; i--) {
            res[j] = split[i];
            j++;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for(String str : res){
            stringBuilder.append(str).append(' ');
        }
        if(stringBuilder.length()>0){
            return stringBuilder.substring(0,stringBuilder.length()-1);
        }else{
            return "";
        }

    }
}
