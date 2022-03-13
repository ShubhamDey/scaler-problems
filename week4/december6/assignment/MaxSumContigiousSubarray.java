package week4.december6.assignment;

import java.util.List;

/*
 * Find the contiguous non-empty subarray within an array, A of length N, with the largest sum.
 * 
 * NOTE: Return an integer representing the maximum possible sum of the contiguous subarray.
 */

public class MaxSumContigiousSubarray {
	
	// DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
    	
    	int answer = 0;
    	for(int i = 0 ; i < A.size() ; i++) {
    		int sum = 0;
    		for(int j = i ; j < A.size() ; j++) {
    			sum += A.get(j);
    			answer = Math.max(answer, sum);
    		}
    	}
    	return answer;
    	
    }

}
