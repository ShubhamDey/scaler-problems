package week15.march2.assignment;

import java.util.ArrayList;

/*
 * Given an array of positive integers A, check and return whether the array elements are consecutive or not.
 * Return 1 if the array elements are consecutive else return 0.
 * 
 * NOTE: Try this with O(1) extra space.
 */

public class ArrayWithConsecutiveElements {
	
	public int solve(ArrayList<Integer> A) {
    
		for(int i = 0 ; i < A.size() ; i++) {
			for(int j = 0 ; j < A.size() - 1 ; j++) {
				if(A.get(j) > A.get(j + 1)) {
					int temp = A.get(j);
					A.set(j, A.get(j + 1));
					A.set(j + 1, temp);
				}
			}
		}
		int current = A.get(0);
		for(int i = 1 ; i < A.size() ; i++) {
			if(A.get(i) == current + 1) {
				current++;
			}
			else {
				return 0;
			}
		}
		return 1;
	
	}

}
