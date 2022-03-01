package week3.november29.homework;

import java.util.ArrayList;

/*
 * You are given an array of integers A of size N.
 * Return the difference between the maximum among all even numbers of A and the minimum among all odd numbers in A.
 */

public class MinimumPicks {

	public int solve(ArrayList<Integer> A) {
		
		int maxEven = Integer.MIN_VALUE, minOdd = Integer.MAX_VALUE;
		for(int i = 0 ; i < A.size() ; i++) {
			if(A.get(i) % 2 == 0) {
				maxEven = Math.max(maxEven, A.get(i));
			}
			else {
				minOdd = Math.min(minOdd, A.get(i));
			}
		}
		return maxEven - minOdd;
		
	}
	
}
