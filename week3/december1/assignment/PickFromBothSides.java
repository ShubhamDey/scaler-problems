package week3.december1.assignment;

import java.util.ArrayList;

/*
 * Given an integer array A of size N. You can pick B elements from either left or right end of the array A to get maximum sum.
 * Find and return this maximum possible sum.
 * 
 * NOTE: Suppose B = 4 and array A contains 10 elements then you can pick first four elements or
 * can pick last four elements or can pick 1 from front and 3 from back etc. you need to return the maximum possible sum of elements you can pick.
 */

public class PickFromBothSides {

	public int solve(ArrayList<Integer> A, int B) {
		
		int size = A.size(), prefix = 0, suffix = 0;
		for(int i = size - B ; i < A.size() ; i++) {
			suffix += A.get(i);
		}
		int ans = suffix;
		for(int i = 0 ; i < B ; i++) {
			prefix += A.get(i);
			suffix = suffix - A.get(size - B + i);
			ans = Math.max(ans, prefix + suffix);
		}
		return ans;
		
	}
	
}
