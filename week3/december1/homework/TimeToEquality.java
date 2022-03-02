package week3.december1.homework;

import java.util.ArrayList;

/*
 * Given an integer array A of size N. In one second you can increase the value of one element by 1.
 * Find the minimum time in seconds to make all elements of the array equal.
 */

public class TimeToEquality {

	public int solve(ArrayList<Integer> A) {
		
		int maxElement = Integer.MIN_VALUE, totalSum = 0;
		for(int i = 0 ; i < A.size() ; i++) {
			totalSum += A.get(i);
			maxElement = Math.max(maxElement, A.get(i));
		}
		return (maxElement * A.size()) - totalSum;
		
	}
	
}
