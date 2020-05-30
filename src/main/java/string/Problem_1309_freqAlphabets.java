package string;


public class Problem_1309_freqAlphabets {

    public static void main(String[] args) {
        String s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#";
        System.out.println(freqAlphabets(s));
        System.out.println(freqAlphabets2(s));
    }

    public static String freqAlphabets(String s){
        String ans = "";
        for (int i = 0; i < s.length() ; i++) {
            if(i+2 < s.length() && s.charAt(i+2) == '#'){
                ans += (char)((s.charAt(i) - '0') * 10 + (s.charAt(i+1)-'1') + 'a');
                i += 2;
            }else{
                ans += (char)(s.charAt(i) - '1' + 'a');
            }
        }
        return ans;
    }


    public static String freqAlphabets2(String s){
        String ans = "";
        for (int i = 0; i < s.length() ; i++) {
            if(i+2 < s.length() && s.charAt(i+2) == '#'){
                ans += (char)(Integer.parseInt(s.substring(i,i+2)) + 96);
                i += 2;
            }else{
                ans += (char)(Integer.parseInt(s.substring(i,i+1)) + 96);
            }
        }
        return ans;
    }
}
