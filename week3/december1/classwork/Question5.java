package week3.december1.classwork;

/*
 * Given N array elements, count how many special indexes are there.
 * 
 * NOTE: An index is said to be special index, if after deleting that index, sum of even indices == sum of odd indices
 */

public class Question5 {
	
	public int specialIndex(int[] Array) {
		
		int count = 0;
		int[] prefixEven = new int[Array.length];
		prefixEven[0] = Array[0];
		for(int i = 1 ; i < Array.length ; i++) {
			if(i % 2 == 0) {
				prefixEven[i] = prefixEven[i - 1] + Array[i];
			}
			else {
				prefixEven[i] = prefixEven[i - 1];
			}
		}
		int[] prefixOdd = new int[Array.length];
		prefixOdd[0] = 0;
		for(int i = 1 ; i < Array.length ; i++) {
			if(i % 2 != 0) {
				prefixOdd[i] = prefixOdd[i - 1] + Array[i];
			}
			else {
				prefixOdd[i] = prefixOdd[i - 1];
			}
		}
		for(int i = 0 ; i < Array.length ; i++) {
			int evenSum = 0, oddSum = 0;
			if(i == 0) {
				evenSum = prefixOdd[Array.length - 1];
				oddSum = prefixEven[Array.length - 1] - prefixEven[i];
			}
			else if(i == Array.length - 1) {
				evenSum = prefixEven[i - 1];
				oddSum = prefixOdd[i - 1];
			}
			else {
				evenSum = prefixEven[i - 1] + (prefixOdd[Array.length - 1] - prefixOdd[i]);
				oddSum = prefixOdd[i - 1] + (prefixEven[Array.length - 1] - prefixEven[i]);
			}
			if(evenSum == oddSum) {
				count++;
			}
		}
		return count;
		
	}
	
}
