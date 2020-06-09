package leetcode.array;

public class Factial {
	
	public static int Fact(int n) { 
		if (n == 1) {
			return 1;
		}else if ( n == 0){
			return 1;
		} else {
			return n * Fact( n - 1);
		}
	}
	
	public static int Print(int n) { 
		if( n == 0)
			return 0;
		else {
			return Print(n-1);
		}
		
	}

	public static void main(String[] args) {
		System.out.println(Fact(10));
		Print(5);
	}

		


}
