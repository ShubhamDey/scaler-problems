package week4.december6.assignment;

import java.util.ArrayList;

/*
 * Given an array of size N, find the subarray of size K with the least average.
 * 
 * NOTE: Return the index of the first element of the subarray of size k that has least average.Array indexing starts from 0.
 */

public class SubarrayWithLeastAverage {
	
	public int solve(ArrayList<Integer> A, int B) {
		
		int sum = 0;
		for(int i = 0 ; i < B ; i++) {
			sum += A.get(i);
		}
		int index = 0, average = sum;
		for(int i = B ; i < A.size() ; i++) {
			sum = sum - A.get(i - B) + A.get(i);
			if(average > sum) {
				average = sum;
				index = (i - B  + 1);
			}
		}
		return index;
		
	}

}
