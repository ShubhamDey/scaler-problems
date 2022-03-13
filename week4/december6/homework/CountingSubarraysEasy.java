package week4.december6.homework;

import java.util.ArrayList;

/*
 * Given an array A of N non-negative numbers and a non-negative number B, you need to find the number of subarrays in A with a sum less than B.
 */

public class CountingSubarraysEasy {
	
	public int solve(ArrayList<Integer> A, int B) {
		
		int count = 0;
		for(int i = 0 ; i < A.size() ; i++) {
			int sum = 0;
			for(int j = i ; j < A.size() ; j++) {
				sum += A.get(j);
				if(sum < B) {
					count++;
				}
			}
		}
		return count;
		
	}

}
