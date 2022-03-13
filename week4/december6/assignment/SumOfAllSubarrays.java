package week4.december6.assignment;

import java.util.ArrayList;

/*
 * You are given an integer array A of length N. You have to find the sum of all subarray sums of A.
 * More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting zero or
 * more elements from either end of the array. A subarray sum denotes the sum of all the elements of that subarray.
 */

public class SumOfAllSubarrays {
	
	public Long subarraySum(ArrayList<Integer> A) {
		
		long sum = 0;
		for(int i = 0 ; i < A.size() ; i++) {
			int left = i + 1;
			int right = A.size() - i;
			sum +=  1L* A.get(i) * left * right;
		}
		return sum;
		
	}

}
