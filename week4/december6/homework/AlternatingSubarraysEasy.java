package week4.december6.homework;

import java.util.ArrayList;

/*
 * You are given an integer array A of length N comprising of 0's & 1's, and an integer B.
 * You have to tell all the indices of array A that can act as a center of 2 * B + 1 length 0-1 alternating subarray.
 * A 0-1 alternating array is an array containing only 0's & 1's, and having no adjacent 0's or 1's.
 * For e.g. arrays [0, 1, 0, 1], [1, 0] and [1] are 0-1 alternating, while [1, 1] and [0, 1, 0, 0, 1] are not.
 * 
 * NOTE: Return an integer array containing indices(0-based) in sorted order. If no such index exists, return an empty integer array.
 */

public class AlternatingSubarraysEasy {
	
	public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i = B ; i < A.size() - B ; i++) {
			boolean left = true;
			for(int j = i - 1 ; j >= i - B ; j--) {
				if(A.get(j) == A.get(j + 1)) {
					left = false;
					break;
				}
			}
			boolean right = true;
			for(int j = i + 1 ; j <= i + B ; j++) {
				if(A.get(j) == A.get(j - 1)) {
					right = false;
					break;
				}
			}
			if(left && right) {
				result.add(i);
			}
		}
		return result;
		
	}

}
