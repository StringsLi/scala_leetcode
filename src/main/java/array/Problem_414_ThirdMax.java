package array;

public class Problem_414_ThirdMax {

    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 1};
        System.out.println(thirdMax(nums));
        System.out.println(thirdMax2(nums));
    }

    public static int thirdMax(int[] nums){
         long first = Long.MIN_VALUE;
         long second = Long.MIN_VALUE;
         long third = Long.MIN_VALUE;

         for(int num:nums){
             if(num > first){
                 third = second;
                 second = first;
                 first = num;
             }else if(num > second && num < first){
                 third = second;
                 second =  num;
             }else  if(num > third && num < second){
                 third =  num;
             }
         }

         return (third == Long.MIN_VALUE || third == second)? (int) first : (int) third;


    }

    public static int thirdMax2(int[] nums) {
        long first=Long.MIN_VALUE,second=Long.MIN_VALUE,third=Long.MIN_VALUE;
        for(long num:nums){
            if(num>first){
                third=second;
                second=first;
                first=num;
            }else if(num>second&&num<first){
                third=second;
                second=num;
            }else if(num>third&&num<second){
                third=num;
            }
        }
        return (third==Long.MIN_VALUE||third==second)?(int)first:(int)third;

    }
}
