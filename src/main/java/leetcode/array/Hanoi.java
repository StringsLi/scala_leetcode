package leetcode.array;

public class Hanoi {
	
	
	public static void TowersOfHanoi(int n, char frompeg, char topeg, char auxpeg){
		if(n ==1){
			System.out.println("Move disk 1 from peg "+ frompeg + " to peg " + topeg);
			return;
		}
		TowersOfHanoi(n-1, frompeg, auxpeg, topeg);
		System.out.println("Move disk from peg "+ frompeg + " to peg " + topeg);
		TowersOfHanoi(n-1, auxpeg, topeg, frompeg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     TowersOfHanoi(2, 'A', 'b', 'c');
	}

}
