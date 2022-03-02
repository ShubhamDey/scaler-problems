package week3.december1.assignment;

import java.util.ArrayList;

/*
 * Given an array, arr[] of size N, the task is to find the count of array indices such that
 * removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.
 */

public class SpecialIndex {

	public int solve(ArrayList<Integer> A) {
		
		int count = 0;
		int[] prefixEven = new int[A.size()];
		prefixEven[0] = A.get(0);
		for(int i = 1 ; i < A.size() ; i++) {
			if(i % 2 == 0) {
				prefixEven[i] = prefixEven[i - 1] + A.get(i);
			}
			else {
				prefixEven[i] = prefixEven[i - 1];
			}
		}
		int[] prefixOdd = new int[A.size()];
		prefixOdd[0] = 0;
		for(int i = 1 ; i < A.size() ; i++) {
			if(i % 2 != 0) {
				prefixOdd[i] = prefixOdd[i - 1] + A.get(i);
			}
			else {
				prefixOdd[i] = prefixOdd[i - 1];
			}
		}
		for(int i = 0 ; i < A.size() ; i++) {
			int evenSum = 0, oddSum = 0;
			if(i == 0) {
				evenSum = prefixOdd[A.size() - 1];
				oddSum = prefixEven[A.size() - 1] - prefixEven[i];
			}
			else if(i == A.size() - 1) {
				evenSum = prefixEven[i - 1];
				oddSum = prefixOdd[i - 1];
			}
			else {
				evenSum = prefixEven[i - 1] + (prefixOdd[A.size() - 1] - prefixOdd[i]);
				oddSum = prefixOdd[i - 1] + (prefixEven[A.size() - 1] - prefixEven[i]);
			}
			if(evenSum == oddSum) {
				count++;
			}
		}
		return count;
		
	}
	
}
