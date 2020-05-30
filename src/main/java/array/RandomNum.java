package array;

import java.util.Arrays;
import java.util.Random;

public class RandomNum {
	
	public static void numInRange(int[] intList, int min, int max){
		Arrays.sort(intList);
		int range = max - min + 1;
		Random rand = new Random();
		int result = rand.nextInt(range) + min;
		while(Arrays.binarySearch(intList, result)>= 0){
			result = rand.nextInt(range) + min;
		}
		System.out.println(result);
	}

	public static void main(String[] args) {

		int[] intList = {1,3,4,5,6,9};
		numInRange(intList, 0, 10);
		
		System.out.println(Arrays.binarySearch(intList, 5));
	}

}
