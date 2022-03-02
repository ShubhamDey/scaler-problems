package week3.december1.assignment;

import java.util.ArrayList;

/*
 *You are given an integer array A of length N.
 *You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
 *For each query, you have to find the sum of all elements from L to R indices in A (1 - indexed).
 *More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.
 */

public class RangeSumQuery {

	public ArrayList<Long> rangeSum(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
		
		ArrayList<Long> result = new ArrayList<Long>();
		long[] prefix = new long[A.size() + 1];
		prefix[0] = 0;
		for(int i = 1 ; i <= A.size() ; i++) {
			prefix[i] = prefix[i - 1] + A.get(i - 1);
		}
		for(int i = 0 ; i < B.size() ; i++) {
			int left = B.get(i).get(0);
			int right = B.get(i).get(1);
			long sum = prefix[right] - prefix[left - 1];
			result.add(sum);
		}
		return result;
		
	}
	
}
