package week4.december6.assignment;

import java.util.ArrayList;

/*
 * You are given an integer array C of size A.
 * Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum. But the sum must not exceed B.
 * 
 * NOTE: Return a single integer which denotes the maximum sum.
 */

public class MaximumSubarrayEasy {
	
	public int maxSubarray(int A, int B, ArrayList<Integer> C) {
		
		int maxSum = 0;
        for(int i = 0 ; i < A ; i++){
            int sum = 0;
            for(int j = i ; j < A ; j++){
                sum = sum + C.get(j);
                if(sum <= B) {
                	maxSum = Math.max(maxSum, sum);
                }
            }
        }
        return maxSum;
		
	}

}
