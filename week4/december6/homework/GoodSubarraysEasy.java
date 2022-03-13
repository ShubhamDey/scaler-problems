package week4.december6.homework;

import java.util.ArrayList;

/*
 * Given an array of integers A, a subarray of an array is said to be good if it fulfills any one of the criteria:
 * 1. Length of the subarray is be even, and the sum of all the elements of the subarray must be less than B.
 * 2. Length of the subarray is be odd, and the sum of all the elements of the subarray must be greater than B.
 * Your task is to find the count of good subarrays in A.
 */

public class GoodSubarraysEasy {
	
	public int solve(ArrayList<Integer> A, int B) {
		
		int count = 0;
		for(int i = 0 ; i < A.size() ; i++) {
			int sum = 0;
			for(int j = i ; j < A.size() ; j++) {
				sum += A.get(j);
				if((j - i + 1) % 2 == 0 && sum < B || (j - i + 1) % 2 == 1 && sum > B) {
					count++;
				}
			}
		}
		return count;
		
	}

}
